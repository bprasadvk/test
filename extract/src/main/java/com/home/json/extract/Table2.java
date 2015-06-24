package com.home.json.extract;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Table2 {

private String type;
private String spec;
private List<List<String>> data = new ArrayList<List<String>>();
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
* The data
*/
public List<List<String>> getData() {
return data;
}

/**
*
* @param data
* The data
*/
public void setData(List<List<String>> data) {
this.data = data;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
}