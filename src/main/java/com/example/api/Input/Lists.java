package com.example.api.Input;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Lists {
    public static void main(String[] args) {
        int[] arr = {2, 4, -6, 8, -5, -10};
        int[] arr1 = {1, 3, 5, 6, 7};
        int [] rearrange = Arrays.stream(arr)
                .boxed()
                .sorted((a,b) -> Integer.compare(a.compareTo(0), b.compareTo(0)))
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.stream(rearrange).forEach(element -> System.out.print(element + " "));
        System.out.println();


        int[] mergedArray = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1))
                .toArray();

        System.out.println(Arrays.toString(mergedArray));

    }
}
