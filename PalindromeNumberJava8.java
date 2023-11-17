package com.awsravi.sps;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeNumberJava8 {
	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		int number = 121;

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}

	}

	// Function to check if a number is palindrome using Java 8 Streams
	static boolean isPalindrome(int num) {
		String strNum = Integer.toString(num);
		int length = strNum.length();

		return IntStream.range(0, length / 2).allMatch(i -> strNum.charAt(i) == strNum.charAt(length - 1 - i));
	}
}
