package com.qa.backend.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.backend.domain.Dictionary;
import com.qa.backend.utility.JSONUtility;

@Service
public class DictionaryService implements IDictionary {

	@Autowired
	private Dictionary dictionary;

	private JSONUtility util;

	@Override
	public String getDefinition(String key) {
		return util.getJSONForObject(dictionary.getDefinition(key));
	}

	@Override
	public String getAllDefinitions() {
		return util.getJSONForObject(dictionary.getAllDefinitions().toString());
	}



}
