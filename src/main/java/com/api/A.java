package com.api;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(3, 5, 7, 2, 8, 10);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println(min.get());
    }

}
