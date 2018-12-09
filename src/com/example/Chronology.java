package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"calendarType",
"id"
})
public class Chronology {

@JsonProperty("calendarType")
public String calendarType;
@JsonProperty("id")
public String id;

}