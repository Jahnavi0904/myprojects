package Lambdafunction;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray{
    public static void main(String[] args) {
        String[] strings = {"apple", "Grapes", "Watermelon", "pineapple", "Water", "Ice"};

        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()));

        for (String str : strings) {
            System.out.println(str);
        }
    }
}

