package com.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnectionFactory {

	private static Connection con;
	@SuppressWarnings("finally")
	public static Connection  getConnection() {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\mycon.txt");
			
			Properties p = new Properties();
			p.load(fis);
			String url = (String) p.get("url");
			String password = (String) p.get("password");
			String driver = (String) p.get("driver");
			String username = (String) p.get("username");
			
			MysqlDataSource ds = new MysqlDataSource();
			ds.setURL(url);
			ds.setUser(username);
			ds.setPassword(password);
			
			con=ds.getConnection();
			System.out.println(con);
		
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ConnectionFactory->"+e);
		}
		finally {
			return con;
		}
		
	}
	
}
