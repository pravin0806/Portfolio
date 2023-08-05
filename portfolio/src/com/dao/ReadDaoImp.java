package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.EducationPojo;
import com.model.MessagePojo;
import com.model.ProjectPojo;
import com.model.ReadCredentialPojo;
import com.dao.ConnectionFactory;

public class ReadDaoImp implements ReadDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	private int row;
	private String result;

	@SuppressWarnings("finally")
	@Override
	public ArrayList<MessagePojo> readMessage(){
		// TODO Auto-generated method stub
		ArrayList<MessagePojo> arrayList = new ArrayList<>();
		
		try {
			
			sql = "select * from  myportfolio1.message";
			con = ConnectionFactory.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int sn = rs.getInt("sn");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String message = rs.getString("message");
				String date = rs.getString("date");

				MessagePojo m = new MessagePojo(sn, name, email, message, date);
				arrayList.add(m);

			}
		} catch (Exception e) {
			System.out.println("ReadDaoImp->readMessage: " + e);
		} finally {
			return arrayList;
		}

	}

	@SuppressWarnings("finally")
	@Override
	public String readAdminLogin(String username, String password) {
		// TODO Auto-generated method stub

		try {
			
			sql = "select * from  myportfolio1.admininfo where username=? and password=?";
			con = ConnectionFactory.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			boolean b=rs.next();
			if(b==true)
			{
				result="exist";
			}
			else
			{
				result="notexist";
			}
			
			
		} catch (Exception e) {
			System.out.println("ReadDaoImp->readAdminLogin: " + e);
		} finally {
			return result;
		}
		
		
	}

	@SuppressWarnings("finally")
	@Override
	public ReadCredentialPojo readCreadential() {
		
			
			ReadCredentialPojo r =null;
			try {
				sql = "select * from myportfolio1.admininfo";
				con = ConnectionFactory.getConnection();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				rs.next();
//				int sn=rs.getInt("sn");
//				String username=rs.getString("username");
//				String password=rs.getString("password");
//				ReadCredentialPojo r =new ReadCredentialPojo(sn, username, password);
				r = new ReadCredentialPojo(rs.getInt("sn"), rs.getString("username"), rs.getString("password"));
				
			} catch (Exception e) {
				System.out.println("ReadDaoImp->readCreadential: " + e);
			} finally {
				return r;
			}
		}

	@Override
	public ArrayList<ProjectPojo>readProject() {
		
		ArrayList<ProjectPojo> arrayList = new ArrayList<>();
		try {
			sql = "select * from myportfolio1.project";
			con = ConnectionFactory.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int sn = rs.getInt("sn");
				String filename = rs.getString("filename");
				ProjectPojo m = new ProjectPojo(sn, filename);
				arrayList.add(m);
			}
		} catch (Exception e) {
			System.out.println("ReadDaoImp->readMessage: " + e);
		} finally {
			return arrayList;
		}
	}

	@Override
	public ArrayList<EducationPojo>readEdcation() {
		ArrayList<EducationPojo> arrayList = new ArrayList<>();
		try {
			sql = "select * from myportfolio1.education";
			con = ConnectionFactory.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int sn = rs.getInt("sn");
				String year = rs.getString("year");
				String title = rs.getString("title");
				String subtitle = rs.getString("subtitle");
				String desc = rs.getString("description");
				
			EducationPojo e = new EducationPojo(sn, year, title, subtitle, desc);
				arrayList.add(e);
			}
		} catch (Exception e) {
			System.out.println("ReadDaoImp->readMessage: " + e);
		} finally {
			return arrayList;
		}
	}
	}

		

			
		
			
			
				

			



		
	

	




