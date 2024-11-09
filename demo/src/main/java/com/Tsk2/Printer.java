package com.Tsk2;

public class Printer {
    public static void main(String[] args) {
    String input;
    if (args.length > 0) {
    input = args[0];
    } else {
    input = "A man a plan a canal Panama"; // Значение по умолчанию
    }
    boolean result = PalindromeChecker.isPalindrome(input);
    System.out.println("Is the input a palindrome? " +
    result);
    }
    }
