package com.java.collections;

/*
 * In Java, the List interface is part of the Java Collections Framework and represents an ordered collection that allows duplicate elements. 
 * The most common implementations of the List interface are ArrayList, LinkedList, Vector, and Stack. Below are explanations and 
 * examples for each of these implementations.
 * 
 * 1. ArrayList
 * Explanation:
 * - ArrayList is a resizable-array implementation of the List interface.
 * - It allows random access to elements.
 * - It is not synchronized, meaning it is not thread-safe.
 * 
 * Common Methods:
 * - add(E e): Adds an element to the list.
 * - get(int index): Returns the element at the specified position.
 * - remove(int index): Removes the element at the specified position.
 * - size(): Returns the number of elements in the list.
 * - contains(Object o): Checks if the list contains the specified element. 
 *
 * 2. LinkedList
 * Explanation:
 * - LinkedList is a doubly-linked list implementation of the List interface.
 * - It allows sequential access to elements.
 * - It can also be used as a queue or deque.
 * 
 * Common Methods:
 * - add(E e): Adds an element to the list.
 * - addFirst(E e): Adds an element at the beginning of the list.
 * - addLast(E e): Adds an element at the end of the list.
 * - get(int index): Returns the element at the specified position.
 * - removeFirst(): Removes the first element of the list.
 * - removeLast(): Removes the last element of the list.
 * 
 * 3. Vector
 * Explanation:
 * - Vector is a synchronized, resizable array implementation of the List interface.
 * - It is thread-safe, meaning multiple threads can access it without causing inconsistency.
 * - It is generally slower than ArrayList due to synchronization overhead.
 * 
 * Common Methods:
 * - add(E e): Adds an element to the vector.
 * - get(int index): Returns the element at the specified position.
 * - remove(int index): Removes the element at the specified position.
 * - size(): Returns the number of elements in the vector.
 * - contains(Object o): Checks if the vector contains the specified element.
 * 
 * 4. Stack
 * Explanation:
 * - Stack is a subclass of Vector that implements a last-in, first-out (LIFO) stack.
 * - It provides methods specific to stack operations.
 * 
 * Common Methods:
 * - push(E item): Pushes an item onto the top of the stack.
 * - pop(): Removes the object at the top of the stack and returns that object.
 * - peek(): Looks at the object at the top of the stack without removing it.
 * - isEmpty(): Checks if the stack is empty.
 */

import java.util.*;

public class ListCollections {

	public static void main(String[] args) {
		// ArrayList
		List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList: " + arrayList); // Output: [Apple, Banana, Cherry]
        System.out.println("Element at index 1: " + arrayList.get(1)); // Output: Banana
        arrayList.remove(2);
        System.out.println("ArrayList after removal: " + arrayList); // Output: [Apple, Banana]
        System.out.println("Size of ArrayList: " + arrayList.size()); // Output: 2
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana")); // Output: true
        System.out.println();
        
        //LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");

        System.out.println("LinkedList: " + linkedList); // Output: [Dog, Cat, Bird]
        System.out.println("Element at index 1: " + linkedList.get(1)); // Output: Cat
        linkedList.remove(2);
        System.out.println("LinkedList after removal: " + linkedList); // Output: [Dog, Cat]
        ((LinkedList<String>) linkedList).addFirst("Elephant");
        System.out.println("LinkedList after adding first: " + linkedList); // Output: [Elephant, Dog, Cat]
        ((LinkedList<String>) linkedList).removeLast();
        System.out.println("LinkedList after removing last: " + linkedList); // Output: [Elephant, Dog]
        System.out.println();	
        
        //Vector
        List<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        System.out.println("Vector: " + vector); // Output: [Red, Green, Blue]
        System.out.println("Element at index 1: " + vector.get(1)); // Output: Green
        vector.remove(2);
        System.out.println("Vector after removal: " + vector); // Output: [Red, Green]
        System.out.println("Size of Vector: " + vector.size()); // Output: 2
        System.out.println("Contains 'Green': " + vector.contains("Green")); // Output: true
        System.out.println();
        
        //Stack
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack: " + stack); // Output: [One, Two, Three]
        System.out.println("Top element: " + stack.peek()); // Output: Three
        System.out.println("Removed element: " + stack.pop()); // Output: Three
        System.out.println("Stack after pop: " + stack); // Output: [One, Two]
        System.out.println("Is stack empty?: " + stack.isEmpty()); // Output: false
	}
}
