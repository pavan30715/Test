package com.example;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ConvertJasonToJava {
	
	public static void main(String args[]){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); //"1997-07-16T19:20:30.45+01:00"
		
		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File(System.getProperty("user.dir")+"/"+"file2.jason");
		System.out.println(file);

		try{
			
			
		JsonFactory factory = objectMapper.getJsonFactory();
		JsonParser parser = factory.createJsonParser(file);
		JsonNode node = objectMapper.readTree(parser);
		JsonNode value =  node.get("eventType");   // com.tcs.al.shipment.GeolocationChanged
		
		System.out.println("Value ["+value+"]");
		
		String valueStr = node.get("eventType").getTextValue();
		
		System.out.println("valueStr ["+valueStr+"]");
		
		if(valueStr.contains("GeolocationChanged")){
			geolocationObject(sdf, objectMapper, file);
		}else{
			System.out.println("Event Type not Found");
		}
			
	
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	/**
	 * Converting to GeoLocation Object
	 * @param sdf
	 * @param objectMapper
	 * @param file
	 * @throws IOException
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws ParseException
	 */
	private static void geolocationObject(SimpleDateFormat sdf, ObjectMapper objectMapper, File file)
			throws IOException, JsonParseException, JsonMappingException, ParseException {
		Example example = objectMapper.readValue(file, Example.class);		
		String contentType = example.contentType;
		System.out.println("contentType "+contentType+"");
		int eventTime = example.eventTime.dayOfMonth;
		
		System.out.println(eventTime);
		//String eventTime = example.eventTime;
		//String latitude = example.data.latitude;		
		//System.out.println("contentType ["+contentType+"], eventTime ["+eventTime+"] , latitude ["+latitude+"]");			
		//Date eventDate = sdf.parse(eventTime);		
		//System.out.println("eventDate ["+eventDate+"]");
	}

}
