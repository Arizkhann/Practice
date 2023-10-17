package com.java.etc;

public class C6 {

	 public static String reverse(String str) {
	        char[] characters = str.toCharArray();
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            char temp = characters[left];
	            characters[left] = characters[right];
	            characters[right] = temp;
	            left++;
	            right--;
	        }
	        return new String(characters);
	    }

	    public static void main(String[] args) {
	        String input = "Java Programming";
	        String reversed = reverse(input);
	        System.out.println(reversed);
	    }
	}
	
	