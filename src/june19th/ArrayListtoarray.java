package june19th;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoarray{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("XYZ","Abc","Deg","fgh"));
        String[] array = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}

