package com.java.collections;

public class Collections 
{
	/*
	 * In Java, a collection is a framework that provides an architecture to store and manipulate a group of objects. 
	 * Collections are used to store, retrieve, manipulate, and communicate aggregate data. The Java Collections Framework (JCF) 
	 * provides various classes and interfaces to represent and manipulate collections in a standardized way.
	 * 
	 * In Java, the Collection interface is the root interface of the Java Collections Framework. It represents a group of objects 
	 * known as elements. The Collection interface is part of the java.util package and provides the basic operations that 
	 * all collections should have. It is extended by several other interfaces which provide more specific operations.
	 * 
	 * Collection Interface - 
	 * The Collection interface declares the core methods that all collections should implement, such as:
	 * 
	 * - add(E e): Adds an element to the collection.
	 * - remove(Object o): Removes a specified element from the collection.
	 * - size(): Returns the number of elements in the collection.
	 * - isEmpty(): Checks if the collection is empty.	
	 * - contains(Object o): Checks if the collection contains a specified element.
	 * - iterator(): Returns an iterator over the elements in the collection.
	 * - clear(): Removes all elements from the collection.
	 * - toArray(): Returns an array containing all elements in the collection.
	 * 
	 * Types of Collections (Interfaces) - 
	 * The Collection interface is extended by several other interfaces that represent different types of collections:
	 * 
	 * 1) List: An ordered collection (also known as a sequence). Lists can contain duplicate elements. 
	 * 	  The most common implementations are ArrayList, LinkedList, Vector, and Stack.
	 * 
	 * 	- ArrayList: Resizable-array implementation of the List interface.
	 *	- LinkedList: Doubly-linked list implementation of the List interface.
	 * 	- Vector: Synchronized, re-sizable array implementation of the List interface.
	 *	- Stack: Subclass of Vector that implements a last-in, first-out (LIFO) stack.
	 *
	 * 2) Set: A collection that cannot contain duplicate elements. The most common implementations are HashSet, LinkedHashSet, and TreeSet.
	 * 
	 * 	- HashSet: Hash table-based implementation of the Set interface.
	 * 	- LinkedHashSet: Hash table and linked list implementation of the Set interface, with predictable iteration order.
	 *	- TreeSet: Sorted set implementation based on a red-black tree.
	 *
	 * 3) Queue: A collection used to hold multiple elements prior to processing. 
	 * 	  Queues typically order elements in a FIFO (first-in, first-out) manner. 
	 *    The most common implementations are LinkedList and PriorityQueue.
	 *    
	 * 	- LinkedList: Can be used as a queue.
	 * 	- PriorityQueue: Priority heap implementation of the Queue interface.
	 * 
	 * 4) Deque: A double-ended queue that allows elements to be added or removed from both ends. 
	 * The most common implementations are ArrayDeque and LinkedList.
	 * 
	 * 	- ArrayDeque: Resizable-array implementation of the Deque interface.
	 *	- LinkedList: Can be used as a deque.
	 *
	 * 5) Map: An object that maps keys to values. A Map cannot contain duplicate keys, and each key maps to exactly one value. 
	 * The Map interface is not a subtype of the Collection interface, but it is part of the Java Collections Framework. 
	 * The most common implementations are HashMap, LinkedHashMap, and TreeMap.
	 * 
	 *	- HashMap: Hash table-based implementation of the Map interface.
	 *	- LinkedHashMap: Hash table and linked list implementation of the Map interface, with predictable iteration order.
	 *	- TreeMap: Red-black tree-based implementation of the Map interface. 
	 */
}
