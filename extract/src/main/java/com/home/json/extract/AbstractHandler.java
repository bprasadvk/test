package com.home.json.extract;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.json.JsonWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractHandler {

    /** The logger. */
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Gets the json success data.
     *
     * @param results the results
     * @return the json success data
     */
    public static String getJsonSuccessData(List<? extends JsonItem> results) {
        final JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("success", true);
        final JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (JsonItem ji : results) {
            arrayBuilder.add(ji.toJson());
        }
        builder.add("data", arrayBuilder);
        return toJsonString(builder.build());
    }

    /**
     * Gets the json success data.
     *
     * @param jsonItem the json item
     * @return the json success data
     */
    public static String getJsonSuccessData(JsonItem jsonItem) {
        final JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("success", true);
        builder.add("data", jsonItem.toJson());
        return toJsonString(builder.build());
    }

    /**
     * Gets the json success data.
     *
     * @param jsonItem the json item
     * @param totalCount the total count
     * @return the json success data
     */
    public static String getJsonSuccessData(JsonItem jsonItem, int totalCount) {
        final JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("success", true);
        builder.add("total", totalCount);
        builder.add("data", jsonItem.toJson());
        return toJsonString(builder.build());
    }

    /**
     * Gets the json success data.
     *
     * @param results the results
     * @return the json success data
     */
    public static String getJsonSuccessData(List<? extends JsonItem> results, int totalCount) {
        final JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("success", true);
        final JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (JsonItem ji : results) {
            arrayBuilder.add(ji.toJson());
        }
        builder.add("total", totalCount);
        builder.add("data", arrayBuilder);
        return toJsonString(builder.build());
    }

    /**
     * Gets the json error msg.
     *
     * @param theErrorMessage the the error message
     * @return the json error msg
     */
    public static String getJsonErrorMsg(String theErrorMessage) {
        return getJsonMsg(theErrorMessage, false);
    }

    /**
     * Gets the json success msg.
     *
     * @param msg the msg
     * @return the json success msg
     */
    public static String getJsonSuccessMsg(String msg) {
        return getJsonMsg(msg, true);
    }

    /**
     * Gets the json msg.
     *
     * @param msg the msg
     * @param success the success
     * @return the json msg
     */
    public static String getJsonMsg(String msg, boolean success) {
        final JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("success", success);
        builder.add("msg", msg);
        return toJsonString(builder.build());
    }

    /**
     * To json string.
     *
     * @param model the model
     * @return the string
     */
    public static String toJsonString(JsonObject model) {
        final StringWriter stWriter = new StringWriter();
        try (JsonWriter jsonWriter = Json.createWriter(stWriter)) {
            jsonWriter.writeObject(model);
        }
        return stWriter.toString();
    }

    /**
     * Parses the json object.
     *
     * @param jsonString the json string
     * @return the json object
     */
    protected JsonObject parseJsonObject(String jsonString) {
        JsonReader reader = Json.createReader(new StringReader(jsonString));
        return reader.readObject();
    }

    /**
     * Gets the string value.
     *
     * @param jsonValue the json value
     * @return the string value
     */
    protected String getStringValue(JsonValue jsonValue) {
        String value = null;
        switch (jsonValue.getValueType()) {
        case STRING:
            JsonString str = (JsonString) jsonValue;
            value = str.getString();
            break;
        case NULL:
            break;
        default:
            break;
        }
        return value;
    }
}