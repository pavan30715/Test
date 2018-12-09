package com.example;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"fixedOffset",
"transitions",
"transitionRules"
})
public class Rules {

@JsonProperty("fixedOffset")
public Boolean fixedOffset;
@JsonProperty("transitions")
public List<Object> transitions = null;
@JsonProperty("transitionRules")
public List<Object> transitionRules = null;

}