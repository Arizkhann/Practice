package com.java.etc;

public class C4 {

	
	 public static String replaceSubstring(String str, String target, String replacement) {
	        return str.replaceAll(target, replacement);
	    }

	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog.";
	        String target = "fox";
	        String replacement = "cat";
	        String result = replaceSubstring(input, target, replacement);
	        System.out.println(result);
	    }
	
}
