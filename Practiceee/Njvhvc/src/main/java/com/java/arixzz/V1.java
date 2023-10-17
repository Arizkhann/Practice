package com.java.arixzz;

public class V1 {

	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3 };
			int result = arr[3]; // ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}
}
