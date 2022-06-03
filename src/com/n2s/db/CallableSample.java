package com.n2s.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableSample {
	public static Connection conn = null;
	public static CallableStatement cstmt = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Janani", "root", "Diya@1990");
			System.out.println("DB connected");
			cstmt = conn.prepareCall("{call insertrecord(?,?,?)}");
			cstmt.setInt(1, 6);
			cstmt.setString(2, "Arasu");
			cstmt.setString(3, "welcome");
			cstmt.executeUpdate();

			System.out.println("Success");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
