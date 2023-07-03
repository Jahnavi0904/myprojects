package Exception;
class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }
}

public class CustomtoRuntime{

    public static void main(String[] args) {
        try {
            // Throw a runtime exception
            int x = 1 / 0;
        } catch(ArithmeticException e){
            System.out.println(e);
        } catch (RuntimeException e) {
            // Convert the runtime exception into a custom exception
            throw new MyException("Runtime exception occurred: " + e.getMessage());
        }
    }
}
