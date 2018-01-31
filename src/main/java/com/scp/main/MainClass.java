package com.scp.main;

import java.io.IOException;

import org.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.scp.Services.ClientDemo;

public class MainClass {

	public static void main(String[] args) throws JSONException, IOException
	{
		ClientDemo ws= new ClientDemo();		
		System.out.println(ws.getALLCountries());//GET
	}
}
