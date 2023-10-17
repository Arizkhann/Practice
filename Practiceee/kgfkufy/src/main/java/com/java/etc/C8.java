package com.java.etc;

import java.util.ArrayList;
import java.util.List;

public class C8 {
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int result = sum(numbers);
        System.out.println("Sum: " + result);
    }
}
