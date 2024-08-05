package com.java;

public class C_OperatorsProgram {

	public static void main(String[] args) {
		
		// Arithmetic operators
        int a = 10;
        int b = 3;
      
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // Unary Operators
        int a1 = 10;
        int b1 = 10;

        System.out.println("Postincrement : " + (a1++));
        System.out.println("Preincrement : " + (++a1));
        System.out.println("Postdecrement : " + (b1--));
        System.out.println("Predecrement : " + (--b1));

        // Relational operators
        int a2 = 10;
        int b2 = 3;
        int c = 5;
        // always returns boolean values
        System.out.println("a > b: " + (a2 > b2));
        System.out.println("a < b: " + (a2 < b2));
        System.out.println("a >= b: " + (a2 >= b2));
        System.out.println("a <= b: " + (a2 <= b2));
        System.out.println("a == c: " + (a2 == c));
        System.out.println("a != c: " + (a2 != c));
        
        // Logical operators
        boolean x = true;
        boolean y = false;
        // always returns boolean values
        System.out.println("x && y: " + (x && y));		// AND
        System.out.println("x || y: " + (x || y));		// OR
        System.out.println("!x: " + (!x));				// NOT
        
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
        
        System.out.println("d & e: " + (d & e));		// AND
        System.out.println("d | e: " + (d | e));		// OR
        System.out.println("d ^ e: " + (d ^ e));		// XOR 
        System.out.println("~d: " + (~d));				//Complementary operator
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));
        
        // Ternary operators
        int a3 = 20, b3 = 10, c1 = 30, result;

        // result holds max of three
        // numbers
        result = ((a3 > b3) ? (a3 > c1) ? a3 : c1 : (b3 > c1) ? b3 : c1);
        System.out.println("Max of three numbers = " + result);
        
        // Assignment operators
        int f = 7;
        System.out.println("f += 3: " + (f += 3));				// f = f + 3
        System.out.println("f -= 2: " + (f -= 2));				// f = f - 3 
        System.out.println("f *= 4: " + (f *= 4));				// f = f * 3
        System.out.println("f /= 3: " + (f /= 3));				// f = f / 3
        System.out.println("f %= 2: " + (f %= 2));				// f = f % 3
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
	}

}
