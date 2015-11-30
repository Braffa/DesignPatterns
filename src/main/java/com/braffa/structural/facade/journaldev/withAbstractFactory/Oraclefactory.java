package com.braffa.structural.facade.journaldev.withAbstractFactory;

import com.braffa.structural.facade.journaldev.ISQLHelper;
import com.braffa.structural.facade.journaldev.OracleHelper;

public class Oraclefactory implements ISQLHelperAbstractfactory {

	@Override
	public ISQLHelper createSQLHelper() {
		return new OracleHelper();
	}

}
