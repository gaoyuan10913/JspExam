package com.hand.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {
	
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	
	private static final ConnectionDB factory = new ConnectionDB();
	private Connection conn;
	//静态代码块，只会执行一次
	static{
		
		Properties prop = new Properties();
		try {
			InputStream in = ConnectionDB.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");
			prop.load(in);
			
		} catch (IOException e) {
			System.out.println("配置文件读取错误");
		}
		
		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
		
	}
	
	private  ConnectionDB(){}
	
	public static ConnectionDB getInstance(){
		return factory;
	}
	
	public Connection makeconnection(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
