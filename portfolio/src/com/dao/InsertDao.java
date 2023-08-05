package com.dao;

public interface InsertDao {

	public String SaveMessage(String name,String email,String message);
	public String saveProject(String filename);
	public String saveEducation(String year,String title,String subtitle,String desc);
}
