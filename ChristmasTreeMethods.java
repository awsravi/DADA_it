package com.awsravi.sps;

public class ChristmasTreeMethods {
	 public static void main(String[] args) {
	        int n = 5; // adjust the value of n to change the size of the tree

	        printChristmasTree(n);
	    }

	    static void printChristmasTree(int n) {
	        // Print tree body
	        for (int i = 0; i < n; i++) {
	            printSpaces(n - i - 1);
	            printStars(2 * i + 1);
	        }

	        // Print tree trunk
	        printSpaces(n - 1);
	        System.out.println("*");
	    }

	    static void printSpaces(int count) {
	        for (int i = 0; i < count; i++) {
	            System.out.print(" ");
	        }
	    }

	    static void printStars(int count) {
	        for (int i = 0; i < count; i++) {
	            System.out.print("*");
	            
	        }
	        System.out.println();
	    }
	}

