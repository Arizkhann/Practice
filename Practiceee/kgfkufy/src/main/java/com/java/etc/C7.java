package com.java.etc;

public class C7 {
    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String longestWord = findLongestWord(input);
        System.out.println("Longest Word: " + longestWord);
    }
}
