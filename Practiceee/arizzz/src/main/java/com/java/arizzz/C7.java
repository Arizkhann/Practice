package com.java.arizzz;

public class C7 {

	public static void main(String[] args) {

		int arr[] = { 23, 12, 5, 21, 77, 17, 88 };

		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}

		}
		System.out.println("Smallest eklement is"+min);

	}

}
