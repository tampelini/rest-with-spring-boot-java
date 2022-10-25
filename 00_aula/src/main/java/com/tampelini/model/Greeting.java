package com.tampelini.model;

public class Greeting {

	private String content;
	private final long id;
	
	public Greeting(String content, long id) {
		super();
		this.content = content;
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}
	
	
}
