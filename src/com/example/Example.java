package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"cloudEventsVersion",
"eventType",
"source",
"eventID",
"eventTime",
"eventTypeVersion",
"schemaURL",
"contentType",
"extensions",
"data"
})
public class Example {

@JsonProperty("cloudEventsVersion")
public String cloudEventsVersion;
@JsonProperty("eventType")
public String eventType;
@JsonProperty("source")
public String source;
@JsonProperty("eventID")
public String eventID;
@JsonProperty("eventTime")
public EventTime eventTime;
@JsonProperty("eventTypeVersion")
public String eventTypeVersion;
@JsonProperty("schemaURL")
public String schemaURL;
@JsonProperty("contentType")
public String contentType;
@JsonProperty("extensions")
public Extensions extensions;
@JsonProperty("data")
public Data data;

}