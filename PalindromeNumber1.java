package com.awsravi.sps;

import java.util.Scanner;

public class PalindromeNumber1 {
	public static void main(String[] args) {

		System.out.print("Enter a number: ");

		int number = 121;
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}

	}

	// Function to check if a number is palindrome
	static boolean isPalindrome(int num) {
		String original = Integer.toString(num);
		String reversed = new StringBuilder(original).reverse().toString();

		return original.equals(reversed);
	}
}
