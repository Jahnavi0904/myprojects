package stringlibraries;
public class Rotation {

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        else{
            String str3 = str1 + str1;
             return str3.indexOf(str2) != -1;
    }
    }

    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutHibernate";
        String str2 = "StrutHibernateJavaJ2ee";

        boolean isRotation = isRotation(str1, str2);
        System.out.println(isRotation);
    }
}
