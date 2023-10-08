package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersManager {
    public static void SortNumbers(String[] array) {         //Task 11.3 method
        List<Integer> numbers = new ArrayList<>();
        for (String str : array) {
            String[] strNumbers = str.split(", ");
            for (String num : strNumbers) {
                numbers.add(Integer.parseInt(num));
            }
        }

        numbers.sort(Comparator.naturalOrder());

        String result = numbers.stream()
                .map(number -> number.toString())
                .collect(Collectors.joining(", ")) + ".";

        System.out.println(result);
    }


}
