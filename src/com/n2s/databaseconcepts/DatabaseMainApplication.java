package com.n2s.databaseconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseMainApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/Janani";
		String uname = "root";
		String pass = "Diya@1990";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("insert into Employee values(2,'Akhash',36)");
		rs.next();
		// String name = rs.getString("user_name");
		// System.out.println(name);
		st.close();
		con.close();

	}

}
