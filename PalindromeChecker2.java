package com.awsravi.sps;
public class PalindromeChecker2 {
    public static void main(String[] args) {
        String input = "radar"; // You can replace this with any other string

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

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at the corresponding positions don't match
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }
}
