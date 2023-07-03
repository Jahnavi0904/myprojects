package Arrayoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveLast{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("XYZ","Abc","Deg","fgh"));
        System.out.println("Before removal: " + list);

        if (list.size()>0) {
            list.remove(list.size() - 1);
        }

        System.out.println("After removal: " + list);
    }
}
