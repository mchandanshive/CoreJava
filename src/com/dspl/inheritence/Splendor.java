package com.dspl.inheritence;

public class Splendor extends Bike{

	public Splendor(){
		this.colour = "red";
		this.category = "Standard";
	}
	public String getMilage(){
		return "Splendor milage 70";
	}

	public String getSpledorProfile(){
		String profile =  this.getColour()+ ":" + this.getCategory()+ ":" + this.getMilage();
		return profile;
	}
	
}
