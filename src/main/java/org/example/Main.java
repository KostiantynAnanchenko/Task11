package org.example;

import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Ivan", "Viktor", "Peter", "Jerry", "Rick", "Morty", "Summer", "Beth", "Stan", "Kenny");

        System.out.println("\nTask 11.1 TEST");                     // Task 11.1 TEST

        System.out.println(NamesManager.oddPositionNames(names));


        System.out.println("\nTask 11.2 TEST");                       // Task 11.2 TEST
        System.out.println(NamesManager.getSortedNames(names));


        System.out.println("\nTask 11.3 TEST");                       // Task 11.3 TEST

        String[] numbers = {"1, 2, 0", "4, 5"};

        NumbersManager.getSortedNumbers(numbers);


        System.out.println("\nTask 11.4 TEST");                       // Task 11.4 TEST

        long a = 25214903917L;
        long c = 11L;
        long m = (1L << 48);

        Stream<Long> randomStream = RandomGenerator.generateRandomStream(a, c, m);

        randomStream.limit(5).forEach(System.out::println);


        System.out.println("\nTask 11.5 TEST");                      // Task 11.5 TEST

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(5, 6, 7, 8, 9);

        Stream<Integer> zippedStream = StreamZipper.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);


    }


}
