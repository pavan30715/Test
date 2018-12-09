package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"uuid",
"shipmentNumber",
"latitude",
"longitude"
})
public class Data {

@JsonProperty("uuid")
public String uuid;
@JsonProperty("shipmentNumber")
public String shipmentNumber;
@JsonProperty("latitude")
public String latitude;
@JsonProperty("longitude")
public String longitude;

}