package com.safefood.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProxy {
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://database-2.cvttaxlfphnv.ap-northeast-2.rds.amazonaws.com:3306/safefood?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "admin", "adminadmin1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
