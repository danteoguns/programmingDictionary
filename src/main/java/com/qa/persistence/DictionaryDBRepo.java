package com.qa.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.utility.JSONUtility;

@Transactional(TxType.REQUIRED)
public class DictionaryDBRepo implements IDictionary {

	@Inject
	private JSONUtility utility;

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	public String getDefinition(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

}
