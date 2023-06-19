package Lambdafunction;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringContainVowels{
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};

        Arrays.stream(strings)
                .filter(str -> containsVowels(str))
                .forEach(str -> System.out.println("String: " + str + ", Number of Vowels: " + countVowels(str)));
    }

    private static boolean containsVowels(String str) {
        return str.chars().anyMatch(ch -> isVowel((char) ch));
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static int countVowels(String str) {
        return (int) str.chars().filter(ch -> isVowel((char) ch)).count();
    }
}
