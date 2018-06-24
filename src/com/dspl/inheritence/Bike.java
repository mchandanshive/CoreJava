package com.dspl.inheritence;

public class Bike {
	protected String colour;
	protected String category;

	public Bike(){
		
	}
	
	public String getMilage(){
		return "Average milage of Bike is 60";
	}
	
	public String getColour(){
		return this.colour;
	}
	
	public String getCategory(){
		return this.category;
	}
}
