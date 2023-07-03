package june29;
import java.util.Optional;

public class IOstring {

    public static Optional<Integer> getStringLength(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            return Optional.of(input.length());
        }
    }

    public static void main(String[] args) {
        String input1 = "Hello, world!";
        String input2 = null;

        Optional<Integer> length1 = getStringLength(input1);
        System.out.println("Length of input1: " + length1.orElse(-1)); // Output: 13

        Optional<Integer> length2 = getStringLength(input2);
        System.out.println("Length of input2: " + length2.orElse(-1)); // Output: -1
    }
}
