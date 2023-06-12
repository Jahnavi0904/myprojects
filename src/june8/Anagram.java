package june8;
import java.util.Arrays;

        public class Anagram {
                public static void main (String[]args){
                    String str1 = "Traingle";
                    String str2 = "Integral";

                    char[] arr1 = str1.toLowerCase().toCharArray();
                    char[] arr2 = str2.toLowerCase().toCharArray();

                    Arrays.sort(arr1);
                    Arrays.sort(arr2);

                    String Newstr1= new String(arr1);
                    String Newstr2= new String(arr2);

                    if (Newstr1.equals(Newstr2)){
                                System.out.println(str1 + " and " + str2 + " are anagrams.");
                            }
                    else {
                        System.out.println(str1 + " and " + str2 + " are not anagrams.");
                    }
                }
            }
