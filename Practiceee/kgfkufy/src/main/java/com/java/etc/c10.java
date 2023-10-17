package com.java.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;

public class c10 {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return new ArrayList<>(new LinkedHashSet<>(numbers));
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("List with Duplicates Removed: " + uniqueNumbers);
    }
}

