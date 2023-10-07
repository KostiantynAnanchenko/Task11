package org.example;

import java.util.stream.Stream;

public class RandomGenerator {

    public static Stream<Long> generateRandomStream(long a, long c, long m) {      //Task 11.4 method

        long seed = System.currentTimeMillis();

        Stream<Long> result = Stream.iterate(seed, x -> (a * x + c) % m);

        return result;
    }
}
