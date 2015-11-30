package com.braffa.structural.facade.journaldev;

import java.sql.Connection;

public interface ISQLHelper {
	
	public Connection getDBConnection();

	public void generatePDFReport(String tableName, Connection con);

	public void generateHTMLReport(String tableName, Connection con);
}
