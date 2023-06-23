package Hashset;
import java.util.HashSet;
import java.util.Iterator;

public class TenStrings{

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Jahnavi");
        set.add("John");
        set.add("Jay");
        set.add("Joseph");
        set.add("Janitor");
        set.add("Jonathon");
        set.add("James");
        set.add("Jiya");
        set.add("Jeveean");
        set.add("Jeph");

        System.out.println("Iteration using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

        System.out.println("\nIteration using forEach loop:");
        for (String string : set) {
            System.out.println(string);
        }

        System.out.println("\nIteration using Streams forEach:");
        set.forEach(System.out::println);
    }
}
