package com.example.api.Input;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str = "My name is Rahul";
        List<String> list = Arrays.stream(str.split("\\s")).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> list1 = Arrays.asList("foo", "barjkhjkj", "boo");
        List<Integer> length = list1.stream().map(String::length).collect(Collectors.toList());
        System.out.println(length);

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = number.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        List<String> strings = Arrays.asList("foo", "barjkhjkj", "boo");
        List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStrings);

        List<Integer> numberss = Arrays.asList(1, 2, 3, 5, 5, 6, 7, 7, 9, 10);
        List<Integer> unique = numberss.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

        List<Person> people = Arrays.asList(new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 35),
                new Person("Alice", 40));
        Map<String, List<Person>> groupedByNames = people.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(groupedByNames);

        List<Person> over30 = people.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
        System.out.println(over30);

        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2, 4), Arrays.asList(3, 5), Arrays.asList(6));
        List<Integer> flattenedNumbers = nestedNumbers.stream().flatMap(Collection::stream).sorted().collect(Collectors.toList());
        System.out.println(flattenedNumbers);

        flattenedNumbers.sort((a, b) -> b.compareTo(a));
        System.out.println(flattenedNumbers);


        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Integer> list3 = Arrays.asList(4, 5, 6);
        List<Integer> mergedList = Stream.concat(list2.stream(), list3.stream()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(mergedList);

        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sums = Arrays.stream(num)
                .reduce(0,(a,b) -> a+b);
        System.out.println(sums);


    }
}