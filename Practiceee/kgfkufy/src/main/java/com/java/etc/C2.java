package com.java.etc;

public class C2 {

	
	public static void main(String[] args) {

		// Declare and initialize an integer array 'arr' with values 2, 3, and 5.

		int arr[] = new int [] {2,3,5};

		try {

		// Attempt to divide arr[2] by 0, which will result in an ArithmeticException.

		int a = arr[2]/0;

		} catch (ArithmeticException e) {

		// TODO Auto-generated catch block

		// Catch the ArithmeticException if it occurs and execute the code inside this block.

		System.err.println("Cannnot be Divisible...");

		}

		}
	
	
	
}
