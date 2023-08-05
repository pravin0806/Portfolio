package com.model;

public class EducationPojo {

	private int sn;
	private String year;
	private String title;
	private String subtitle;
	private String desc;
	
	public EducationPojo(int sn, String year, String title, String subtitle, String desc) {
		super();
		this.sn = sn;
		this.year = year;
		this.title = title;
		this.subtitle = subtitle;
		this.desc = desc;
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
