
package Hashset;
public class Duplicate {

    public static String Duplicateremove(String str) {

        StringBuilder MyString = new StringBuilder();
        str.chars().distinct().forEach(c -> MyString.append((char) c));
        return MyString.toString();
    }
    public static void main(String[] args) {

        String str = "Jahnavi katta";
        System.out.println(Duplicateremove(str));
    }
}
