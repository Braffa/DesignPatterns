package com.braffa.structural.facade.journaldev.withAbstractFactory;

import com.braffa.structural.facade.journaldev.ISQLHelper;
import com.braffa.structural.facade.journaldev.MySqlHelper;

public class MySqlFactory implements ISQLHelperAbstractfactory {

	@Override
	public ISQLHelper createSQLHelper() {
		return new MySqlHelper();
	}

}
