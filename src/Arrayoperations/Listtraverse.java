package Arrayoperations;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Listtraverse{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("xyz", "ABC", "deg");
        System.out.println("Enter the Method");
        Scanner scanner = new Scanner(System.in);
        String Method= scanner.next();

        switch (Method) {
            case "for": {
                System.out.println("Traversing the list using a for loop:");

                for (int i = 0; i < list.size(); i++) {
                    String element = list.get(i);
                    System.out.println(element);
                }
                break;
            }

            case "enhancedfor": {
                System.out.println("\nTraversing the list using an enhanced for loop:");
                for (String element : list) {
                    System.out.println(element);
                }
                break;
            }

            case "While": {
                System.out.println("\nTraversing the list using an iterator:");
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String element = iterator.next();
                    System.out.println(element);
                }
                break;
            }

            case "Foreach": {
                System.out.println("\nTraversing the list using forEach method:");
                list.forEach(element -> System.out.println(element));
                break;
            }
            case "parallel":{
                System.out.println("\nTraversing the list using parallel stream:");
                list.parallelStream().forEachOrdered(element -> System.out.println(element));
                break;
            }
        }
        scanner.close();
    }
}
