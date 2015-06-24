package com.home.json.extract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Table1 {

private String type;
private String spec;
private String title;
private List<Pic> pics = new ArrayList<Pic>();
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

/**
*
* @return
* The pics
*/
public List<Pic> getPics() {
return pics;
}

/**
*
* @param pics
* The pics
*/
public void setPics(List<Pic> pics) {
this.pics = pics;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


