package com.java.collections;

/*
 * In Java, the Map interface is part of the Java Collections Framework and represents a collection of key-value pairs. 
 * The most common implementations of the Map interface are HashMap, LinkedHashMap, TreeMap, and Hashtable. 
 * Below are explanations and examples for each of these implementations.
 * 
 * 1. HashMap
 * Explanation:
 * - HashMap is a hash table-based implementation of the Map interface.
 * - It allows null values and the null key.
 * - It does not maintain any order of its elements.
 * 
 * Common Methods:
 * - put(K key, V value): Associates the specified value with the specified key in this map.
 * - get(Object key): Returns the value to which the specified key is mapped.
 * - remove(Object key): Removes the mapping for the specified key from this map if present.
 * - containsKey(Object key): Returns true if this map contains a mapping for the specified key.
 * - containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
 * 
 * 2. LinkedHashMap
 * Explanation:
 * - LinkedHashMap is a hash table and linked list implementation of the Map interface, with predictable iteration order.
 * - It maintains a doubly-linked list running through all of its entries.
 * - It allows null values and the null key.
 * 
 * Common Methods:
 * - put(K key, V value): Associates the specified value with the specified key in this map.
 * - get(Object key): Returns the value to which the specified key is mapped.
 * - remove(Object key): Removes the mapping for the specified key from this map if present.
 * - containsKey(Object key): Returns true if this map contains a mapping for the specified key.
 * - containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
 * 
 * 3. TreeMap
 * Explanation:
 * - TreeMap is a NavigableMap implementation based on a red-black tree.
 * - It guarantees that the map is in ascending key order.
 * - It does not allow null keys but allows null values.
 * 
 * Common Methods:
 * - put(K key, V value): Associates the specified value with the specified key in this map.
 * - get(Object key): Returns the value to which the specified key is mapped.
 * - remove(Object key): Removes the mapping for the specified key from this map if present.
 * - containsKey(Object key): Returns true if this map contains a mapping for the specified key.
 * - containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
 * - firstKey(): Returns the first (lowest) key currently in this map.
 * - lastKey(): Returns the last (highest) key currently in this map.
 */

import java.util.*;

public class MapInterface {

	public static void main(String[] args) {
		
		//HashMap
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        System.out.println("HashMap: " + hashMap); // Output: HashMap: {Apple=1, Banana=2, Cherry=3}
        System.out.println("Value for 'Banana': " + hashMap.get("Banana")); // Output: Value for 'Banana': 2
        hashMap.remove("Cherry");
        System.out.println("HashMap after removal: " + hashMap); // Output: HashMap after removal: {Apple=1, Banana=2}
        System.out.println("Contains key 'Apple': " + hashMap.containsKey("Apple")); // Output: Contains key 'Apple': true
        System.out.println("Contains value 2: " + hashMap.containsValue(2)); // Output: Contains value 2: true
		System.out.println();
		
		//LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Dog", 1);
        linkedHashMap.put("Cat", 2);
        linkedHashMap.put("Bird", 3);

        System.out.println("LinkedHashMap: " + linkedHashMap); // Output: LinkedHashMap: {Dog=1, Cat=2, Bird=3}
        System.out.println("Value for 'Cat': " + linkedHashMap.get("Cat")); // Output: Value for 'Cat': 2
        linkedHashMap.remove("Bird");
        System.out.println("LinkedHashMap after removal: " + linkedHashMap); // Output: LinkedHashMap after removal: {Dog=1, Cat=2}
        System.out.println("Contains key 'Dog': " + linkedHashMap.containsKey("Dog")); // Output: Contains key 'Dog': true
        System.out.println("Contains value 2: " + linkedHashMap.containsValue(2)); // Output: Contains value 2: true
		System.out.println();
		
		//TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Orange", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Banana", 3);

        System.out.println("TreeMap: " + treeMap); // Output: TreeMap: {Apple=2, Banana=3, Orange=1}
        System.out.println("Value for 'Banana': " + treeMap.get("Banana")); // Output: Value for 'Banana': 3
        treeMap.remove("Orange");
        System.out.println("TreeMap after removal: " + treeMap); // Output: TreeMap after removal: {Apple=2, Banana=3}
        System.out.println("Contains key 'Apple': " + treeMap.containsKey("Apple")); // Output: Contains key 'Apple': true
        System.out.println("Contains value 3: " + treeMap.containsValue(3)); // Output: Contains value 3: true
        System.out.println("First key: " + ((TreeMap<String, Integer>) treeMap).firstKey()); // Output: First key: Apple
        System.out.println("Last key: " + ((TreeMap<String, Integer>) treeMap).lastKey()); // Output: Last key: Banana
	}
}
