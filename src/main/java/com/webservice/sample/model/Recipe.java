package com.webservice.sample.model;

import java.util.List;

public class Recipe {
	private String viandName;
	private List<Ingredient> ingredients;
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Recipe(String viandName, List<Ingredient> ingredients) {
		super();
		this.viandName = viandName;
		this.ingredients = ingredients;
	}

	public String getViandName() {
		return viandName;
	}
	public void setViandName(String viandName) {
		this.viandName = viandName;
	}
	public List<Ingredient> getIngredientsList() {
		return ingredients;
	}
	public void setIngredientsList(List<Ingredient> ingredientsList) {
		this.ingredients = ingredientsList;
	}
	
}
