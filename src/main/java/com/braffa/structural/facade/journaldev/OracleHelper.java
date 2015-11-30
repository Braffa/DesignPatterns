package com.braffa.structural.facade.journaldev;

import java.sql.Connection;

public class OracleHelper implements ISQLHelper {

	public Connection getDBConnection() {
		System.out.println("Getting Oracle connection");
		return null;
	}

	public void generatePDFReport(String tableName, Connection con) {
		System.out.println("Generating Oracle PDF report");
	}

	public void generateHTMLReport(String tableName, Connection con) {
		System.out.println("Generating Oracle HTML report");
	}
}
