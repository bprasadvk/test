package com.home.json.extract;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private String type;
	private String spec;
	private String area;
	private String year;
	private String title;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	*
	* @return
	* The type
	*/
	public String getType() {
	return type;
	}

	/**
	*
	* @param type
	* The type
	*/
	public void setType(String type) {
	this.type = type;
	}

	/**
	*
	* @return
	* The spec
	*/
	public String getSpec() {
	return spec;
	}

	/**
	*
	* @param spec
	* The spec
	*/
	public void setSpec(String spec) {
	this.spec = spec;
	}

	/**
	*
	* @return
	* The area
	*/
	public String getArea() {
	return area;
	}

	/**
	*
	* @param area
	* The area
	*/
	public void setArea(String area) {
	this.area = area;
	}

	/**
	*
	* @return
	* The year
	*/
	public String getYear() {
	return year;
	}

	/**
	*
	* @param year
	* The year
	*/
	public void setYear(String year) {
	this.year = year;
	}

	/**
	*
	* @return
	* The title
	*/
	public String getTitle() {
	return title;
	}

	/**
	*
	* @param title
	* The title
	*/
	public void setTitle(String title) {
	this.title = title;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	
  

