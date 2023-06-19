package Lambdafunction;
import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageofSquares{
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13};

        OptionalDouble average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average();

        if (average.isPresent()) {
            System.out.println("Average of squares of odd numbers: " + average.getAsDouble());
        } else {
            System.out.println("No odd numbers found.");
        }
    }
}
