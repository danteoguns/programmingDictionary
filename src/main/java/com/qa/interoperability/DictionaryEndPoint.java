package com.qa.interoperability;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.qa.backend.persistence.IDictionary;

@Path("/dictionary")
public class DictionaryEndPoint {
	
	private IDictionary service;
	
	@Path("/definition")
	@GET
	public String GetDefinition(String word) {
		return service.getDefinition(word);
	}
	
	@Path("/all-definition")
	@GET
	public String GetAllDefinition() {
		return service.getAllDefinitions();
	}

}
