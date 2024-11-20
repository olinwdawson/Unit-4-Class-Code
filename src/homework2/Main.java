package homework2;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");
    }

    public static void indivVowelCounter(String str, char vowel) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) { // Changed <= to <
            if (str.charAt(i) == Character.toLowerCase(vowel)) {
                count++;
            }
        }
        System.out.println("Number of " + vowel + "'s: " + count);
    }

    public static void vowelCounter(String str) {
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) { // Changed <= to <
            indivVowelCounter(str, vowels.charAt(i));
        }
    }

    public static void palindromeChecker(String str) {
        int length = str.length();
        boolean palindrome = true;
        for (int a = 0; a < length / 2; a++) { // Adjusted loop to check only half
            if (Character.toLowerCase(str.charAt(a)) != Character.toLowerCase(str.charAt(length - 1 - a))) {
                palindrome = false;
                break; // Exit loop early if not a palindrome
            }
        }

        if (palindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

