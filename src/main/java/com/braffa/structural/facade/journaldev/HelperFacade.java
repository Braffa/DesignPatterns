package com.braffa.structural.facade.journaldev;

import java.sql.Connection;

public class HelperFacade {

	public static void generateReport(DBTypes dbType, ReportTypes reportType,
			String tableName) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			ISQLHelper MySqlHelper = new MySqlHelper();
			con = MySqlHelper.getDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch (reportType) {
			case HTML:
				mySqlHelper.generateHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generatePDFReport(tableName, con);
				break;
			}
			break;
		case ORACLE:
			ISQLHelper OracleHelper = new OracleHelper();
			con = OracleHelper.getDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportType) {
			case HTML:
				oracleHelper.generateHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generatePDFReport(tableName, con);
				break;
			}
			break;
		}
	}
}
