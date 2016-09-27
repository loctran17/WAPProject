package com.wap.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.OAuth2Token;
import twitter4j.conf.ConfigurationBuilder;
import wap.com.model.TwitterDatabase;
import wap.com.model.TwitterItem;
import wap.com.model.TwitterTrend;

/**
 * Servlet implementation class TwitterServlet
 */
@WebServlet("/TwitterServlet")
public class TwitterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Twitter twitter = TwitterConnection.getInstance();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwitterServlet() {
        super();
        // TODO Auto-generated constructor stub        
    }
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
				
		if (getServletContext().getAttribute("category") == null) {
			// Default is Romance category
			getServletContext().setAttribute("category", "Romance");
		}
		String category = (String)getServletContext().getAttribute("category");
		
		try {
			out.println("Twitter----");
			List<TwitterItem> itemList = TwitterDatabase.getTwitterItems(category);
			/*
			for (TwitterItem i: itemList) {
				out.println("content:" + i.getContent());
				out.println("image" + i.getImage());
				out.println("========================================================================");
			}
			*/
			
			getServletContext().setAttribute("categoryList", itemList);
			response.sendRedirect("index.jsp");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get avalable trends
		try {
			out.println("Trends----");
			List<TwitterTrend> trends = TwitterDatabase.getTwitterTrends();
			for (TwitterTrend i: trends) {
				
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Redirect this list for view (browser)
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
