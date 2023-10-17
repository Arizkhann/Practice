package com.java.arizzz;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {12, 45, 67, 89, 34, 7};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        System.out.println("The second largest element is: " + secondMax);
    }
}
// int[] numbers = {12, 45, 67, 89, 34, 7};

//int firstMax = numbers[0];
//int secondMax = numbers[0];
//
//for (int num : numbers) {
//    if (num > firstMax) {
//        secondMax = firstMax;
//        firstMax = num;
//    } else if (num > secondMax && num != firstMax) {
//        secondMax = num;
//    }
//}
//
//System.out.println("The second largest element is: " + secondMax);
//}
//}
//Both of these programs will find the second largest number in the given array without using Integer.MIN_VALUE or any other predefined methods.





