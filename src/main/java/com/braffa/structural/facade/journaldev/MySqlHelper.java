package com.braffa.structural.facade.journaldev;

import java.sql.Connection;

public class MySqlHelper implements ISQLHelper {

	public Connection getDBConnection() {
		System.out.println("Getting mysql connection");
		return null;
	}

	public void generatePDFReport(String tableName, Connection con) {
		System.out.println("Generating MySql PDF report");
	}

	public void generateHTMLReport(String tableName, Connection con) {
		System.out.println("Generating MySql HTML report");
	}

}
