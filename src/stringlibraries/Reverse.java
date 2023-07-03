package stringlibraries;
public class Reverse{
    public static void main(String[] args) {
        String str1 = "jashkjui is hyte";
        String[] words = str1.split(" ");

        for (String word : words) {
            String reversedWord = reverseString(word);
            System.out.print(reversedWord + " ");
        }
    }

    public static String reverseString(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
