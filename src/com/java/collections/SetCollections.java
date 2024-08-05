package com.java.collections;

/*
 * In Java, the Set interface is part of the Java Collections Framework and represents a collection that does not allow duplicate elements. 
 * The most common implementations of the Set interface are HashSet, LinkedHashSet, and TreeSet. Below are explanations and 
 * examples for each of these implementations.
 * 
 * 1. HashSet
 * Explanation: 
 * - HashSet is a hash table-based implementation of the Set interface.
 * - It makes no guarantees about the iteration order of the set; in particular, it does not guarantee that the order will 
 *   remain constant over time.
 * - It allows null elements.
 * 
 * Common Methods:
 * - add(E e): Adds an element to the set.
 * - remove(Object o): Removes the specified element from the set.
 * - contains(Object o): Checks if the set contains the specified element.
 * - size(): Returns the number of elements in the set.
 * - isEmpty(): Checks if the set is empty.
 * 
 * 2. LinkedHashSet
 * Explanation:
 * - LinkedHashSet is a hash table and linked list implementation of the Set interface, with predictable iteration order.
 * - It maintains a doubly-linked list running through all of its entries.
 * - It allows null elements.
 * 
 * Common Methods:
 * - add(E e): Adds an element to the set.
 * - remove(Object o): Removes the specified element from the set.
 * - contains(Object o): Checks if the set contains the specified element.
 * - size(): Returns the number of elements in the set.
 * - isEmpty(): Checks if the set is empty.
 * 
 * 3. TreeSet
 * Explanation:
 * - TreeSet is a NavigableSet implementation based on a red-black tree.
 * - It guarantees that the elements are in ascending order.
 * - It does not allow null elements.
 * 
 * Common Methods:
 * - add(E e): Adds an element to the set.
 * - remove(Object o): Removes the specified element from the set.
 * - contains(Object o): Checks if the set contains the specified element.
 * - size(): Returns the number of elements in the set.
 * - isEmpty(): Checks if the set is empty.
 * - first(): Returns the first (lowest) element currently in the set.
 * - last(): Returns the last (highest) element currently in the set.
 * 
 */
import java.util.*;

public class SetCollections {

	public static void main(String[] args) {
		// HashSet
		Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element, will not be added

        System.out.println("HashSet: " + hashSet); // Output: [Apple, Banana, Cherry]
        System.out.println("Size of HashSet: " + hashSet.size()); // Output: 3
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana")); // Output: true
        hashSet.remove("Cherry");
        System.out.println("HashSet after removal: " + hashSet); // Output: [Apple, Banana]
		System.out.println();
		
		//LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Bird");
        linkedHashSet.add("Dog"); // Duplicate element, will not be added

        System.out.println("LinkedHashSet: " + linkedHashSet); // Output: [Dog, Cat, Bird]
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size()); // Output: 3
        System.out.println("Contains 'Cat': " + linkedHashSet.contains("Cat")); // Output: true
        linkedHashSet.remove("Bird");
        System.out.println("LinkedHashSet after removal: " + linkedHashSet); // Output: [Dog, Cat]
		System.out.println();
		
		//TreeSet
		Set<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange"); // Duplicate element, will not be added

        System.out.println("TreeSet: " + treeSet); // Output: [Apple, Banana, Orange]
        System.out.println("Size of TreeSet: " + treeSet.size()); // Output: 3
        System.out.println("Contains 'Banana': " + treeSet.contains("Banana")); // Output: true
        System.out.println("First element: " + ((TreeSet<String>) treeSet).first()); // Output: Apple
        System.out.println("Last element: " + ((TreeSet<String>) treeSet).last()); // Output: Orange
        treeSet.remove("Banana");
        System.out.println("TreeSet after removal: " + treeSet); // Output: [Apple, Orange]
	}
}
