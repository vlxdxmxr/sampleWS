package com.webservice.sample.model;

import java.io.Serializable;

public class SampleWSResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SampleWSResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SampleWSResponse(Recipe recipe) {
		super();
		this.recipe = recipe;
	}

	private Recipe recipe;

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
