package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"comTcsAlExtensions"
})
public class Extensions {

@JsonProperty("comTcsAlExtensions")
public ComTcsAlExtensions comTcsAlExtensions;

}