package com.awsravi.sps;

public class ChristmasTreeLoops {
	 public static void main(String[] args) {
	        int height = 5; // Adjust the height of the tree

	        // Print the tree
	        printChristmasTree(height);
	    }

	    static void printChristmasTree(int height) {
	        // Print tree body
	        for (int i = 0; i < height; i++) {
	            // Print spaces
	            for (int j = 0; j < height - i - 1; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("*");
	            }

	            System.out.println(); // Move to the next line
	        }

	        // Print tree trunk
	        for (int i = 0; i < height - 1; i++) {
	            System.out.print(" ");
	        }
	        System.out.println("*");
	    }
	}


