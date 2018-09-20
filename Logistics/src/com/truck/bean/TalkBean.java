package com.truck.bean;

public class TalkBean {
	private int id;
	private String pname;
	private String text;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TalkBean [id=" + id + ", pname=" + pname + ", text=" + text
				+ ", date=" + date + "]";
	}
	
}
