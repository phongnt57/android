package com.example.red;


public class RssItem {
	private String title;
	//private String description;
	private String link;
	//private String date;
	private String description;
	private String date;
	public RssItem()
	{
		this.title ="Not Internet";
		this.link = "Not Internet";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

}
