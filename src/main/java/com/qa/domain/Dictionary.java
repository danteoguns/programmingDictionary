package com.qa.domain;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dictionary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private HashMap<String, String> definitions;

	
	public Dictionary () {
		
	}
	
	public long getId() {
		return id;
	}
	
	public HashMap<String, String> getDefinitions() {
		return definitions;
	}

}
