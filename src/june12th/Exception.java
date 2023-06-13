package june12th;

import java.util.Scanner;

public class Exception {

    public static int convertToInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println(e);
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = convertToInt(s);
        System.out.println("Converted value: " + result);
    }
}
