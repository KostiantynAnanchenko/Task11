package org.example;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NamesManager {

    public static String oddPositionNames(List<String> names) {         //Task 11.1 method
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", ")) + ".";
    }

    public static String getSortedNames(List<String> names) {              //Task 11.2 method

        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        Collections.reverse(sortedNames);

        sortedNames.replaceAll(name -> name.toUpperCase());

        return sortedNames.toString();


    }

}

