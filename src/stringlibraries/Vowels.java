package stringlibraries;

public class Vowels {
    public static void main(String[] args){
        String[] arr1={"a","e","i","o","u"};
        String str="Execute The Code";
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<str.length();j++){
            if(arr1[i].equalsIgnoreCase(String.valueOf(str.charAt(j)))) {
                count++;
            }
            }
        }
        System.out.println("the string is:"+str);
        System.out.println("No:of vowels:"+count);
    }
}
