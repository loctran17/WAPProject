<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style.css" type="text/css" rel="stylesheet" />
<script src="js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<span id="romance">Romance</span>
	<span id="comedy">Comedy</span> 
	<span id="sci-fiction">SCI-Fiction</span> 
	<span id="sitcome">Sitcome</span> 
	<span id="seetrend">See Trend</span>
	
	<br /> 
		 
	<table id="tweettable">
	<c:forEach var="item" items="${categoryList}" varStatus="counter" >
		<tr>
			<td class="twitterItem">  
				<a href="${item.link}" > <img id="" src="${item.image}" alt="item1" height="42" width="42"> ${item.content } </a>
			</td>
		</tr>
	</c:forEach>
	</table>
	
	
	
	<div id="itemGalery">This part for items in Twitter based on category </div>
</body>
</html>