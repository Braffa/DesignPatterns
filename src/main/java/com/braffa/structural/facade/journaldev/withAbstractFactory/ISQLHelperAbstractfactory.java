package com.braffa.structural.facade.journaldev.withAbstractFactory;

import com.braffa.structural.facade.journaldev.ISQLHelper;

public interface ISQLHelperAbstractfactory {

	public ISQLHelper createSQLHelper ();
}
