package com.java.oops.examples;

class ExHierarchicalInheritanceMain 
{
	@SuppressWarnings("unused")
	public static void main(String []args) 
	{
		ExHierarchicalInheritance animal = new ExHierarchicalInheritance("Lion", 5); 	// Create generic animal (limited functionality)
	
		LandAnimal lion = new LandAnimal("Simba", 3, "Savanna"); 						// Create a LandAnimal object
		System.out.println("Land Animal Name: " + lion.getName()); 						// Output: Land Animal Name: Simba
		System.out.println("Land Animal Habitat: " + lion.getHabitat()); 				// Output: Land Animal Habitat: Savanna
		lion.makeSound(); 																// Output: Generic land animal sound
	
		WaterAnimal dolphin = new WaterAnimal("Flipper", 2, "Ocean"); 					// Create a WaterAnimal object
		System.out.println("Water Animal Name: " + dolphin.getName()); 					// Output: Water Animal Name: Flipper
		System.out.println("Water Animal Type: " + dolphin.getWaterType()); 			// Output: Water Animal Type: Ocean
		dolphin.makeSound(); 															// Output: Generic water animal sound
	
		// Both LandAnimal and WaterAnimal inherit the base class functionalities (getName, getAge).
	}
}


