package Lambdafunction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Uppercase{
    public static void main(String[] args) {
        String[] strings = {"Jahnavi", "shhags", "sxbhjjhs", "wyeufiudjek","jjhb"};

        Arrays.stream(strings)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
