/*
 *	Facade Pattern
 *		Provide a unified interface to a set of interfaces in a subsystem. Facade
 *		Pattern defines a higher-level interface that makes the subsystem easier to
 *		use.
 *
 * 		1.	Facade pattern is more like a helper for client applications, it doesn’t
 *		2.	hide subsystem interfaces from the client. Whether to use Facade or
 *			not is completely dependent on client code.
 *		3.	Facade pattern can be applied at any point of development, usually
 *	 		when the number of interfaces grow and system gets complex.
 *		4.	Subsystem interfaces are not aware of Facade and they shouldn’t have
 *			any reference of the Facade interface.
 *		5.	Facade pattern should be applied for similar kind of interfaces, its
 *		6.	purpose is to provide a single interface rather than multiple interfaces
 *			that does the similar kind of jobs.
 * 		7.	We can use Factory pattern with Facade to provide better interface to
 *			client systems.
 */

package com.braffa.structural.facade.journaldev;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

public class FacadePatternTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String tableName = "Employee";
		// generating MySql HTML report and Oracle PDF report without using
		// Facade
		MySqlHelper MySqlHelper = new MySqlHelper();
		Connection con = MySqlHelper.getDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateHTMLReport(tableName, con);

		OracleHelper OracleHelper = new OracleHelper();
		Connection con1 = OracleHelper.getDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generatePDFReport(tableName, con1);
		
		

		// generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);

		HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
	}

}
