package com.awsravi.sps;

import java.util.Scanner;

public class PalindromeNumber {
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
		int originalNumber = num;
		int reversedNumber = 0;

		while (num > 0) {
			int remainder = num % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			num = num / 10;
		}

		return originalNumber == reversedNumber;
	}
}
