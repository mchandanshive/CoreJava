package com.dspl.inheritence;

public class Application {

	public static void main(String args[]){
		Bike bike = new Bike();
		Pulsor pulsor = new Pulsor();
		Bike splendor = new Splendor();
		
		System.out.println("Profile -->" + pulsor.getPulsorProfile());
		System.out.println("Profile -->" +((Splendor) splendor).getSpledorProfile());
		
//		System.out.println("Bike-->"+bike.getMilage());
//		System.out.println("Pulsor-->"+pulsor.getMilage());
//		System.out.println("Splendor-->"+splendor.getMilage());
		
		
		
	}
	
}
