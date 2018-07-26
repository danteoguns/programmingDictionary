package com.qa.backend.domain;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"definitions"
})

public class Dictionary {
	
	@JsonProperty("definitions")
	private HashMap<String, String> definitions;

	
	public Dictionary () {
		
		definitions = new HashMap<>();
		definitions.put("String", "Collection of characters which can be letters and numeric.");
		definitions.put("Int", "A data type used for whole numeric values");

		
	}
	
	@JsonProperty("definitions")
	public HashMap<String, String> getDefinitions() {
		return definitions;
	}
	
	@JsonProperty("definitions")
	public String getDefinition(String key) {
		return definitions.get(key);
	}
	
	

}
