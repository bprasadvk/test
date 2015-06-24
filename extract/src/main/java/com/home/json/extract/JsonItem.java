package com.home.json.extract;

import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public interface JsonItem {

    /**
     * To json.
     *
     * @return the json object
     */
    public JsonObject toJson();

    /**
     * Adds the json.
     *
     * @param builder the builder
     */
    public void addJson(JsonObjectBuilder builder);

}
