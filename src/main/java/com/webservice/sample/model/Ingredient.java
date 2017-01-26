package com.webservice.sample.model;

public class Ingredient {
	private String ingredientName;
	private String ingredientQuantityUnit;
	private String ingredientQuantity;

	public Ingredient() {
		super();
	}
	
	public Ingredient(String ingredientName, String ingredientQuantityUnit, String ingredientQuantity) {
		super();
		this.ingredientName = ingredientName;
		this.ingredientQuantityUnit = ingredientQuantityUnit;
		this.ingredientQuantity = ingredientQuantity;
	}
	
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public String getIngredientQuantityUnit() {
		return ingredientQuantityUnit;
	}
	public void setIngredientQuantityUnit(String ingredientQuantityUnit) {
		this.ingredientQuantityUnit = ingredientQuantityUnit;
	}
	public String getIngredientQuantity() {
		return ingredientQuantity;
	}
	public void setIngredientQuantity(String ingredientQuantity) {
		this.ingredientQuantity = ingredientQuantity;
	}
	
	
}
