package com.braffa.structural.facade.journaldev.withAbstractFactory;

import com.braffa.structural.facade.journaldev.ISQLHelper;


public class SQLHelperFactory  {
	
	public SQLHelperFactory () {
		
	}
	
	public static ISQLHelper getSQLHelper(ISQLHelperAbstractfactory factory){
		return factory.createSQLHelper();
		}

}
