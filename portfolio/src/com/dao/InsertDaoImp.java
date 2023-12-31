package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDaoImp implements InsertDao {


	private Connection con;
	private PreparedStatement ps;
	private String sql;
	private String result;
	private int row;

	@SuppressWarnings("finally")
	@Override
	public String SaveMessage(String name, String email, String message) {

		try {
			con = ConnectionFactory.getConnection();
			
			sql = "insert into myportfolio1.message(name,email,message) values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, message);
			row = ps.executeUpdate();
			if (row == 1)
				result = "saved";
		} catch (Exception e) {
			System.out.println("InsertDaoImp:saveMessage->" + e);
			result = "exp";
		} finally {
			return result;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public String saveProject(String filename) {
		// TODO Auto-generated method stub
		try {
			con = ConnectionFactory.getConnection();
			sql = "insert into myportfolio1.project(filename) values(?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, filename);
			row = ps.executeUpdate();
			if (row == 1)
				result = "saved";
		} catch (Exception e) {
			System.out.println("InsertDaoImp:saveProject->" + e);
			result = "exp";
		} finally {
			return result;
		}
	}

	@Override
	public String saveEducation(String year, String title, String subtitle, String desc) {
		// TODO Auto-generated method stub
		try {
			 con = ConnectionFactory.getConnection();
			 sql="insert into myportfolio1.education(year,title,subtitle,description) values(?,?,?,?)";
			  ps = con.prepareStatement(sql);
			  ps.setString(1, year);
			  ps.setString(2, title);
			  ps.setString(3, subtitle);
			  ps.setString(4, desc);
			  row=ps.executeUpdate();
			  if(row==1)
				  result="saved";
			
		} catch (Exception e) {
			System.out.println("InsertDaoImp->saveEducation"+e);
			result="exp";
		}finally {
			return result;
		}
	}
	
	
	
}
		
	


	

