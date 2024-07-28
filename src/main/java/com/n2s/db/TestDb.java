package com.n2s.db;

import java.sql.SQLException;

public class TestDb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DbConnection.closeDb();
			DbConnection.openDb();
			DbConnection.openDb();
			DbConnection.closeDb();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
