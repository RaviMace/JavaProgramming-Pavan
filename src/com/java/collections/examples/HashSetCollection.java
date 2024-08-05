package com.java.collections.examples;

//"Collection" is interface available in java.util
import java.util.*;

/*
* HashSet - is class which is implemented Set interface
* 
* - Heterogeneous data - allowed
* - Insertion order - not preserved(Index not supported)
* - Duplicate elements - not allowed
* - Multiple nulls - not allowed/only single null is allowed
*/

public class HashSetCollection {

	public static void main(String[] args) {
		
		// Declaration
		Set<Object> set = new HashSet<Object>();
		
		// Adding Elements in HashSet
		set.add(100);
		set.add(10.5);
		set.add("Welcome");
		set.add('A');
		set.add(true);
		set.add(null);
		set.add(944361456);
		set.add(null);												//- while printing it will remove this duplicate
		
		// Size of HashSet
		System.out.println("Size of an HastSet "+set.size());		// print the size of a HashSet : 7
				
		// Printing HashSet
		System.out.println("Printing data from HashSet "+set);		// prints the all the data of an HashSet in non preserved manner
		
		// Removing element from array list
		set.remove('A');											// A is value (not a index)
		System.out.println("After removing "+set);
		
		// Inserting Element - not possible
		// Directly accessing a specific element - not possible
		
		// To access specific element indirectly
		// Convert HashSet ->ArrayList
		List<Object> al = new ArrayList<Object>(set);
		System.out.println(al.get(2));
		
		// Reading all the elements from HashSet
		// we can read using "enhanced for loop", but not "for loop". Because Set does not have index
		// and in Set there is not separate Iterator like in List(ListIterator)
		Iterator<Object> it = set.iterator(); // under this, it has only - hasNext, next, remove
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Remove all the elements from array list
		set.clear();												// this will clear all the elements in HashSet
		System.out.println("is HashSet empty? "+set.isEmpty());		// will give boolean value : true
	}
}
