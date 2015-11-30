package com.braffa.structural.facade.journaldev.withAbstractFactory;

import java.sql.Connection;

import com.braffa.structural.facade.journaldev.DBTypes;
import com.braffa.structural.facade.journaldev.ISQLHelper;
import com.braffa.structural.facade.journaldev.ReportTypes;

public class HelperFacadeUsingAbstractFactory {

	public static void generateReport(DBTypes dbType, ReportTypes reportType,
			String tableName) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			ISQLHelper mySqlHelper = SQLHelperFactory.getSQLHelper(new MySqlFactory());
			con = mySqlHelper.getDBConnection();
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
			ISQLHelper oracleHelper = SQLHelperFactory.getSQLHelper(new Oraclefactory());
			con = oracleHelper.getDBConnection();
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
