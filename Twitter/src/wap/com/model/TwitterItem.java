package wap.com.model;

import java.io.Serializable;

public class TwitterItem implements Serializable{
	private static final long serialVersionUID = 2L;
	
	// Define image, content, header, .... for this 
	private String image;
	private String header;
	private String content;
	private String link;
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	public TwitterItem() {
		
	}
	
	
}
