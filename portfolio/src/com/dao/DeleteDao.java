package com.dao;

public interface DeleteDao {

	public String deleteMessage(int sn);
	public String deleteProject(int sn,String filename);
	public String deleteEducation(int sn,String year,String title,String subtitle,String desc);
}
