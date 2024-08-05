package com.java.oops.examples;

class ExHierarchicalInheritance 
{
	
	  private String name;
	  private int age;
	
	  public ExHierarchicalInheritance(String name, int age) 
	  {
		  this.name = name;
		  this.age = age;
	  }
	
	  public void makeSound() 
	  {
		  System.out.println("Generic animal sound");
	  }
	
	  public String getName() 
	  {
		  return this.name;
	  }
	
	  public int getAge() 
	  {
		  return this.age;
	  }
}

class WaterAnimal extends ExHierarchicalInheritance 
{
	  private String waterType;

	  public WaterAnimal(String name, int age, String waterType) 
	  {
		  super(name, age);  // Call base class constructor with arguments
		  this.waterType = waterType;
	  }

	  public void makeSound() 
	  {
		  System.out.println("Generic water animal sound");
	  }

	  public String getWaterType() 
	  {
		  return waterType;
	  }
}
class LandAnimal extends ExHierarchicalInheritance 
{
	  private String habitat;

	  public LandAnimal(String name, int age, String habitat) 
	  {
		  super(name, age);  // Call base class constructor with arguments
		  this.habitat = habitat;
	  }

	  public void makeSound() 
	  {
		  System.out.println("Generic land animal sound");
	  }

	  public String getHabitat() 
	  {
		  return habitat;
	  }
}


