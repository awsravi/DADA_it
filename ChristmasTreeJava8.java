package com.awsravi.sps;

import java.util.stream.IntStream;

public class ChristmasTreeJava8 {
	 public static void main(String[] args) {
	        int height = 5; // Adjust the height of the tree

	        // Print the tree
	        printChristmasTree(height);
	    }

	    static void printChristmasTree(int height) {
	        // Print tree body
	        IntStream.range(0, height)
	            .forEach(i -> {
	                // Print spaces
	                IntStream.range(0, height - i - 1).forEach(j -> System.out.print(" "));
	                
	                // Print stars
	                IntStream.range(0, 2 * i + 1).forEach(k -> System.out.print("*"));

	                System.out.println(); // Move to the next line
	            });

	        // Print tree trunk
	        IntStream.range(0, height - 1).forEach(i -> System.out.print(" "));
	        System.out.println("*");
	    }
}
