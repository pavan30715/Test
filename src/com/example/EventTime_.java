package com.example;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"offset",
"zone",
"year",
"monthValue",
"month",
"dayOfMonth",
"dayOfYear",
"dayOfWeek",
"hour",
"minute",
"second",
"nano",
"chronology"
})
public class EventTime_ {

@JsonProperty("offset")
public Offset offset;
@JsonProperty("zone")
public Zone zone;
@JsonProperty("year")
public Integer year;
@JsonProperty("monthValue")
public Integer monthValue;
@JsonProperty("month")
public String month;
@JsonProperty("dayOfMonth")
public Integer dayOfMonth;
@JsonProperty("dayOfYear")
public Integer dayOfYear;
@JsonProperty("dayOfWeek")
public String dayOfWeek;
@JsonProperty("hour")
public Integer hour;
@JsonProperty("minute")
public Integer minute;
@JsonProperty("second")
public Integer second;
@JsonProperty("nano")
public Integer nano;
@JsonProperty("chronology")
public Chronology chronology;

}