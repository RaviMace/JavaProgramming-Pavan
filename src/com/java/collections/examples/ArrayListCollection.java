package com.java.collections.examples;

// "Collection" is interface available in java.util
import java.util.*;

/*
 * ArrayList - is class which is implemented List interface
 * 
 * - Heterogeneous data - allowed
 * - Insertion order - preserved(Index)
 * - Duplicate elements - allowed
 * - Multiple nulls - allowed
 */

public class ArrayListCollection 
{
	public static void main(String[] args) 
	{
		//Declaration
		//ArrayList list = new ArrayList(); 				// with this we can assign all kind of data, but will give some warnings
		// or
		//List list = new ArrayList();						// Parent to child 
		// or
		//ArrayList<String> list = new ArrayList<String>(); // if it is String type of list, it can only hold string type of data
		// or
		List<Object> list = new ArrayList<Object>();	// with this also we can assign all kind of data
		
		// List of methods
		
		// Adding Elements in ArrayList
		list.add(100);												//a[0]
		list.add(10.5);												//a[1]
		list.add("Welcome");										//a[2]
		list.add('A');												//a[3]
		list.add(true);												//a[4]
		list.add(null);												//a[5]
		list.add(944361456);										//a[6]
		list.add(null);												//a[7]
		
		// Size of array list
		System.out.println("Size of an arraylist "+list.size());	// print the size of a array list : 8
		
		// Printing array list
		System.out.println("Printing data from arraylist "+list);	// prints the all the data of an array list : [....]
		
		// Removing element from array list
		list.remove(5);												// remove a[5] from array list
		System.out.println("After removing "+list);
		
		// Insert element in the array list
		list.add(3, "Java");										// adds new array in the place or a[3] and pushes down other arrays
		System.out.println("After inserting "+list);
		
		// Modify element in the array list (modify/replace/change)
		list.set(4, "Python");										// replaces a[4] "welcome"- "Python"
		System.out.println("After replacing "+list);
		
		//Access specific element from array list
		System.out.println(list.get(3));							// gets the a[3] values and prints
		
		// Reading all the elements from array list
		// we can read using "for loop" and "enhanced for loop" also.
		// we can use this also, this is common to all collection. But can't use some list methods to this common Iterator
		//Iterator<Object> it = list.iterator(); // under this, it has only - hasNext, next, remove
		// So we will be using "ListIterator" from collection. where we can use all the list methods 
		//under this, it has  hasNext, next, remove, hasPrevious, previous, nextIndex, previousIndex, add, set
		ListIterator<Object> it=list.listIterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Checking array list is empty or not
		System.out.println("is Array list empty? "+list.isEmpty());	// will give boolean value : false
		
		// Remove random elements in the group from array list
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add("Java");
		list2.add("Python");
		
		list.removeAll(list2);
		System.out.println("After removing multiple elements "+list);
		
		// Remove all the elements from array list
		list.clear();												// this will clear all the elements in array list
		System.out.println("is Array list empty? "+list.isEmpty());	// will give boolean value : true
		
	}

}
