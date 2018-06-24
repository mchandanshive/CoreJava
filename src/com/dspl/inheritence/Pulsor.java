package com.dspl.inheritence;

public class Pulsor extends Bike{

	public Pulsor(){
		this.category = "Sports";
		this.colour = "Yellow";
	}
	
	public String getMilage(){
		return "Puslor milage 40";
	}
	
	public String getPulsorProfile(){
		String profile =  this.getColour()+ ":" + this.getCategory()+ ":" + this.getMilage();
		return profile;
	}
}
