package com.apex.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.apex.sample.beans.JavaBeans;

public class DbAccess {

	public static Connection getConnection() throws Exception {
		Connection dbConn = null;

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/apex";
		dbConn = DriverManager.getConnection(url, "root", "");
		return dbConn;

	}

	public static void insert(JavaBeans jb) throws Exception {
		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsInserted = 0;

		dbConn = getConnection();
		pStmt = dbConn
				.prepareStatement("INSERT INTO student_info(firstname, lastname, middlename, gender, address, city, state, country, phone, bankname, account, ssn) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		pStmt.setString(1, jb.getFirstName());
		pStmt.setString(2, jb.getLastName());
		pStmt.setString(3, jb.getMiddleName());
		pStmt.setString(4, jb.getGender());
		pStmt.setString(5, jb.getAddress());
		pStmt.setString(6, jb.getCity());
		pStmt.setString(7, jb.getState());
		pStmt.setString(8, jb.getCountry());
		pStmt.setString(9, jb.getPhone());
		pStmt.setString(10, jb.getBankName());
		pStmt.setString(11, jb.getAccount());
		pStmt.setString(12, jb.getSsn());

		rowsInserted = pStmt.executeUpdate();

		pStmt.close();
		
		if (rowsInserted != 1) {
			throw new Exception("Error in inserting the row");
		}

		return;
	}

}
