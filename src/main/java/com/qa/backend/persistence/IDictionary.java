package com.qa.backend.persistence;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public interface IDictionary {

	String getDefinition(String key);

	Collection<String> getAllDefinitions();
	
	String test();

}
