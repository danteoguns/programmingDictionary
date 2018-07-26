package com.qa.controller;

import java.util.Collection;

import javax.ws.rs.PathParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.backend.persistence.IDictionary;

@RequestMapping("/dictionary")
@RestController
public class DictionaryController {

	@Autowired
	private static final Logger LOG = Logger.getLogger(DictionaryController.class);
	
	@Autowired
	private IDictionary service;
	
	@RequestMapping("/get-definition/{key}")
	@ResponseBody
	public String getDefinition(@PathParam ("key") String key) {	
		LOG.info("front end method for get definition");
		return service.getDefinition(key);
	}
	
	
	@RequestMapping("/get-all-definitions")
	@ResponseBody
	public Collection<String> getAllDefinitions() {
		LOG.info("front end method for get all definition");
		return service.getAllDefinitions();
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		LOG.info("front end method for test method");
		return service.test();
	}

}