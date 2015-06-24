package com.home.json.extract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pic {

    private String type;
    private List<Integer> dim = new ArrayList<Integer>();
    private String file;
    private String descr;
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
    * The dim
    */
    public List<Integer> getDim() {
        return dim;
    }

    /**
    *
    * @param dim
    * The dim
    */
    public void setDim(List<Integer> dim) {
        this.dim = dim;
    }

    /**
    *
    * @return
    * The file
    */
    public String getFile() {
        return file;
    }

    /**
    *
    * @param file
    * The file
    */
    public void setFile(String file) {
        this.file = file;
    }

    /**
    *
    * @return
    * The descr
    */
    public String getDescr() {
        return descr;
    }

    /**
    *
    * @param descr
    * The descr
    */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}