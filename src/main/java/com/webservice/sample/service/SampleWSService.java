package com.webservice.sample.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.webservice.sample.model.Ingredient;
import com.webservice.sample.model.Recipe;
import com.webservice.sample.model.SampleWSRequest;
import com.webservice.sample.model.SampleWSResponse;

@WebService
public class SampleWSService {
	
	@WebMethod (operationName = "getRecipe")
	public @WebResult(name= "SampleWSResponse", partName = "SampleWSResponse")  SampleWSResponse getViandRecipe(@WebParam(name = "SampleWSRequest",partName = "SampleWSRequest" ) SampleWSRequest sampleWSRequest) {
	
		Logger LOGGER = Logger.getLogger(SampleWSService.class);
		
		List<Ingredient> ingredientList = new ArrayList<Ingredient>();
		
		ingredientList.add(new Ingredient("Pork", "kg", "1.5"));
		ingredientList.add(new Ingredient("Soy Sauce", "L", "1"));
		ingredientList.add(new Ingredient("Vinegar", "L", "1.5"));
		
		SampleWSResponse response = new SampleWSResponse(new Recipe("Pork Adobo", ingredientList));
		
		return response;
	}
	
	@WebMethod (operationName = "getRecipe2")
	public @WebResult(name= "SampleWSResponse", partName = "SampleWSResponse")  SampleWSResponse getViandRecipe2(@WebParam(name = "SampleWSRequest",partName = "SampleWSRequest" ) SampleWSRequest sampleWSRequest) {
	
		Logger LOGGER = Logger.getLogger(SampleWSService.class);
		
		List<Ingredient> ingredientList = new ArrayList<Ingredient>();
		
		ingredientList.add(new Ingredient("2-Pork", "kg", "1.5"));
		ingredientList.add(new Ingredient("2-Soy Sauce", "L", "1"));
		ingredientList.add(new Ingredient("2-Vinegar", "L", "1.5"));
		
		SampleWSResponse response = new SampleWSResponse(new Recipe("2-Pork Adobo", ingredientList));
		
		return response;
	}	
	
}
