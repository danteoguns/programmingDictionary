package com.qa.backend.persistence;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.qa.backend.domain.Dictionary;
import com.qa.backend.utility.JSONUtility;

@Component
public class DictionaryService implements IDictionary{
	
private static final Logger LOG = Logger.getLogger(DictionaryService.class);

	private Dictionary dictionary;
	private JSONUtility util;
	
	@Override
	public String getDefinition(String key) {
		LOG.info("service for method getDefinition");
		return dictionary.getDefinition(key);
	}

	@Override
	public Collection<String> getAllDefinitions() {
		LOG.info("service for method getAllDefinition");
		return dictionary.getDefinitions().values();
	}
	
	@Override
	public String test() {
		LOG.info("service for test method");
		return "test String. connection successful";
	}

}
