package com.java.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class C9 {
    public static int findMax(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        int max = findMax(numbers);
        System.out.println("Maximum: " + max);
    }
}
