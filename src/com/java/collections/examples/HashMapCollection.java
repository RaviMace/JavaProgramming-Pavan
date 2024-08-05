package com.java.collections.examples;

//"Map" is interface available in java.util
import java.util.*;
import java.util.Map.Entry;

/*
* HashMap - is class which is implemented Map interface, which is totally different interface from collection interface
* 
* - Date can be stored in the form of key, value pairs
* - Key is unique, But we can have duplicate values
* - Insertion order not preserved (Index not followed)
*/

public class HashMapCollection {

	public static void main(String[] args) {
		
		// Declaration
		//Map myMap = new HashMap(); (or)
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		// Adding pairs
		map.put(101, "John");
		map.put(102, "Scott");
		map.put(103, "David");
		map.put(101, "Roy");
		map.put(102, "Mace");
		map.put(104, "Mary");
		
		// Printing
		System.out.println(map);
		
		// Size of the HashMap
		System.out.println("Size of HashMap "+map.size());
		
		// Remove pair
		map.remove(103);
		System.out.println("After removing pair "+ map);
		
		// Access value of the key
		System.out.println(map.get(102));								// Output : Mace
		System.out.println(map.get(103));								// Output : null , because we removed the value
		
		// Get all the keys from HashMap
		System.out.println(map.keySet());								// Prints all the keys only
		System.out.println(map.values());								// Prints all the values only
		System.out.println(map.entrySet());								// Prints all updated keys and values
		
		// Reading all the elements from HashMap
		// we can read using "enhanced for loop" also
		// Using Iterator
		Iterator<Entry<Object, Object>> it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
		// Remove all the elements from array list
		map.clear();												// this will clear all the elements in HashSet
		System.out.println("is HashMap empty? "+map.isEmpty());		// will give boolean value : true
		
	}
}
