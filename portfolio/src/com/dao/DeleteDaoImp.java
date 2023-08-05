package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.fileprocessing.FileIoImp;

public class DeleteDaoImp implements DeleteDao {

	private Connection con;
	private PreparedStatement ps;
	private String sql;
	private String result;
	private int row;

	@SuppressWarnings("finally")
	@Override
	public String deleteMessage(int sn) {
		try {
			con = ConnectionFactory.getConnection();
			sql = "delete from myportfolio1.message where sn=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, sn);
			row = ps.executeUpdate();
			if (row == 1)
				result = "deleted";
		} catch (Exception e) {
			System.out.println("DeleteDaoImp->deleteMessage: " + e);
			result = "exp";
		} finally {
			return result;
		}
	}

	@Override
	
		public String deleteProject(int sn,String filename) {
			try {
				con = ConnectionFactory.getConnection();
				con.setAutoCommit(false);
				sql = "delete from myportfolio1.project where sn=?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, sn);
				row = ps.executeUpdate();
				if (row == 1) {
					String res = new FileIoImp().deleteProject(filename);
					if(res.equals("deleted")) {
						con.commit();
						result = "deleted";
					}
					else {
						con.rollback();
						result = "failed";
					}
				}	
			} catch (Exception e) {
				System.out.println("DeleteDaoImp->deleteProject: " + e);
				result = "exp";
			} finally {
				return result;
			}
	}

	@Override
	public String deleteEducation(int sn, String year, String title, String subtitle, String desc) {
		
		try {
			 con = ConnectionFactory.getConnection();
			 String sql="delete from myportfolio1.education where sn=?";
			 ps=con.prepareStatement(sql);
			 ps.setInt(1, sn);
			 int row=ps.executeUpdate();
			 if(row==1)
			 {
				 result="deleted";
			 }
		} catch (Exception e) {
			System.out.println("DeleteDaoImp->Deleteeducation"+e);
			result="failed";
		}
		finally
		{
			return result;
		}
	}

}
