package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"totalSeconds",
"id",
"rules"
})
public class Offset {

@JsonProperty("totalSeconds")
public Integer totalSeconds;
@JsonProperty("id")
public String id;
@JsonProperty("rules")
public Rules rules;

}