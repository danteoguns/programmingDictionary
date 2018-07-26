package com.qa.backend.persistence;

import java.util.HashMap;

//import java.util.Collection;

//import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

// import com.qa.backend.domain.Dictionary;
// import com.qa.backend.utility.JSONUtility;

@Service
public class DictionaryService implements IDictionary {


//	private Dictionary dictionary;
//  private JSONUtility util;
	
	HashMap<String, String> outsideDefinitions = new HashMap<>(); {
		outsideDefinitions.put("String", "Collection of characters, can be either number of letters");
		outsideDefinitions.put("Integer", "whole numbers without a decimal point");
		outsideDefinitions.put("Array", "A collection of a common type of data. ");
		outsideDefinitions.put("POJO", "Plain Old Java Object");
	}

	@Override
	public String getDefinition(String key) {
		return outsideDefinitions.get(key);
//		return dictionary.getDefinition(key);
	}

	@Override
	public HashMap<String, String> getAllDefinitions() {
		return outsideDefinitions;

//		return util.getJSONForObject(dictionary.getAllDefinitions().values());
	}

	@Override
	public String test() {
		return "this test should work";
//		return dictionary.test();
	}

}
