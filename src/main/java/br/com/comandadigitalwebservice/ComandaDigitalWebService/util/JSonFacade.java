package br.com.comandadigitalwebservice.ComandaDigitalWebService.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSonFacade {

	public static String test() {
		
		JSONArray array = new JSONArray();
		JSONObject json = new JSONObject();
		
		try {
			json.put("teste", "teste");
			array.put(json);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return array.toString();
	}
}
