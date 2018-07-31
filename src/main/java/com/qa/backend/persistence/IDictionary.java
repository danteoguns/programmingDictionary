package com.qa.backend.persistence;

import java.util.HashMap;

public interface IDictionary {

	String getDefinition(String key);

	HashMap<String, String> getAllDefinitions();

}
