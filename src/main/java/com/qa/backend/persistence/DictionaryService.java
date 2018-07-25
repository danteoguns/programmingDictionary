package com.qa.backend.persistence;

import com.qa.backend.domain.Dictionary;
import com.qa.backend.utility.JSONUtility;

public class DictionaryService implements IDictionary{

	private Dictionary dictionary;
	private JSONUtility util;
	
	@Override
	public String getDefinition(String key) {
		return dictionary.getDefinitions().get(key);
	}

	@Override
	public String getAllDefinitions() {
		return util.getJSONForObject(dictionary.getDefinitions().values());
	}

}
