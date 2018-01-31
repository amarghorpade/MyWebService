package com.scp.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scp.webService.Model.User;

public class ClientDemo 
{
	public static List<User> getALLCountries() throws ClientProtocolException, IOException, JSONException {
		DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://jsonplaceholder.typicode.com/users");
		httpGet.addHeader("accept", "application/json");

		HttpResponse response = defaultHttpClient.execute(httpGet);

		HttpEntity entity = response.getEntity();
		String country = EntityUtils.toString(entity);
		List<User> list = new ArrayList<User>();
		ObjectMapper mapper = new ObjectMapper();
		JSONArray jsonArray = new JSONArray(country);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject object = jsonArray.getJSONObject(i);
			String sObject = object.toString();
			User c = mapper.readValue(sObject, User.class);
			list.add(c);
		}

		return list;
	}

}
