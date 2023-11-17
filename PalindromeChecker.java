package com.awsravi.sps;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "level"; // You can replace this with any other string

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Removing spaces and converting to lowercase for case-insensitivity
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(str).reverse();

        // Compare the original string with the reversed string
        return str.equals(reversed.toString());
    }
}
