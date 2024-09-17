package com.test;

import com.model.DbConnection;

public class TestDb {
	public static void main(String[] args) {
		
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		connection.getStudentDetails();
	//	connection.addStudent();
	
		connection.updateStudent();
		connection.getStudentDetails();
	}

}
