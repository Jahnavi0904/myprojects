package june29;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> convertToUpperCase(Optional<String> inputOptional) {
        if (inputOptional.isPresent()) {
            String input = inputOptional.get();
            String uppercaseString = input.toUpperCase();
            return Optional.of(uppercaseString);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<String> inputOptional = Optional.of("example");
        Optional<String> resultOptional = convertToUpperCase(inputOptional);

        if (resultOptional.isPresent()) {
            System.out.println("Result: " + resultOptional.get());
        } else {
            System.out.println("Result is empty.");
        }
    }
}
