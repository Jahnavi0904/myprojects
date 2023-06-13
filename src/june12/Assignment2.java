package june12;
class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

public class Assignment2{
    public static void main(String[] args) {
        try {
            int i=2/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(CustomException y){
        CustomException x = new CustomException(y.getMessage());
//            throw x;
        }
    }
}
