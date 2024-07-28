package com.n2s.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedSample {
	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	static String query = "INSERT INTO LOGIN(id,username,password) VALUES(?,?,?)";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Janani", "root", "Diya@1990");
			System.out.println("DB connected");
			pstmt = conn.prepareStatement(query);
			for (int i = 0; i < 3; i++) {
				pstmt.setInt(1, i + 3);
				pstmt.setString(2, "Varsha");
				pstmt.setString(3, "welcome");
				pstmt.executeUpdate();
			}
			System.out.println("Success");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
