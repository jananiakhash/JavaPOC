package com.n2s.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/Janani";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Diya@1990";
	public static Connection conn = null;

	public static void openDb() throws SQLException {
		if (conn == null) {
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("DB connected");

		} else {
			System.out.println("DB connection is already open");
		}
	}

	public static void closeDb() throws SQLException {
		if (conn != null) {
			conn.close();
			System.out.println("DB connection is closed");
			conn = null;

		} else {
			System.out.println(" No DB connection is available to close");
		}
	}

}
