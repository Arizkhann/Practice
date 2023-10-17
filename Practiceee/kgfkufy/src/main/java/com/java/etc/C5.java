package com.java.etc;

public class C5 {

	
	 public static String trimString(String str) {
	        return str.trim();
	    }

	    public static void main(String[] args) {
	        String input = "    This is a trimmed string.    ";
	        String trimmed = trimString(input);
	        System.out.println(trimmed);
	    }
	
	
	
}
