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
	
	@JsonProperty("id")
	private long id;
	@JsonProperty("definitions")
	private HashMap<String, String> definitions;

	
	public Dictionary () {
		
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}
	
	@JsonProperty("definitions")
	public HashMap<String, String> getDefinitions() {
		return definitions;
	}

}
