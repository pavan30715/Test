package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"businessObject",
"triggeredBy",
"version"
})
public class ComTcsAlExtensions {

@JsonProperty("businessObject")
public String businessObject;
@JsonProperty("triggeredBy")
public String triggeredBy;
@JsonProperty("version")
public String version;

}