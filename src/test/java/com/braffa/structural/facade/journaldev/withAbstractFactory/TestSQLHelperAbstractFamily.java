/*
 * 
 * 	using the structural facade pattern and the abstract creational pattern 
 */

package com.braffa.structural.facade.journaldev.withAbstractFactory;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

import com.braffa.structural.facade.journaldev.DBTypes;
import com.braffa.structural.facade.journaldev.ISQLHelper;
import com.braffa.structural.facade.journaldev.ReportTypes;

public class TestSQLHelperAbstractFamily {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMySqlHelper() {
		// generating MySql HTML report and Oracle PDF report without using
		// Facade
		String tableName = "Employee";

		ISQLHelper mySqlHelper = SQLHelperFactory
				.getSQLHelper(new MySqlFactory());
		Connection con = mySqlHelper.getDBConnection();
		mySqlHelper.generateHTMLReport(tableName, con);
		mySqlHelper.generatePDFReport(tableName, con);
	}

	@Test
	public void testOracleHelper() {
		// generating MySql HTML report and Oracle PDF report without using
		// Facade
		
		String tableName = "Employee";

		ISQLHelper oracleHelper = SQLHelperFactory
				.getSQLHelper(new Oraclefactory());
		Connection con = oracleHelper.getDBConnection();
		oracleHelper.generateHTMLReport(tableName, con);
		oracleHelper.generatePDFReport(tableName, con);
	}
	
	@Test
	public void testMySqlHelperFacadeUsingAbstractFactory () {
		// generating MySql HTML report and Oracle PDF report using Facade
		
		String tableName = "Employee";
		
		HelperFacadeUsingAbstractFactory.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
		
	}
	
	@Test
	public void testOraclelHelperFacadeUsingAbstractFactory () {
		// generating MySql HTML report and Oracle PDF report using Facade
		
		String tableName = "Employee";
		
		HelperFacadeUsingAbstractFactory.generateReport(DBTypes.ORACLE, ReportTypes.HTML, tableName);
		
	}
	
}
