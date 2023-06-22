package Hashmaps;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {
        HashMap<String, OtherStudent> studentInfo = new HashMap<>();

        studentInfo.put("jahnavi", new OtherStudent("Jahnavi", "D", 3.8));
        studentInfo.put("Vin", new OtherStudent("Vin", "S", 2.3));
        studentInfo.put("Sita", new OtherStudent("Sita", "I", 1.8));
        studentInfo.put("Ram", new OtherStudent("Ram", "J", 2.9));
        studentInfo.put("christy", new OtherStudent("Christy","K", 3.56));
        studentInfo.put("Don", new OtherStudent("Don", "G", 3.1));
        studentInfo.put("John", new OtherStudent("John", "D", 2.1));
        studentInfo.put("Jim", new OtherStudent("Jim", "P", 2.8));

        for (Map.Entry<String, OtherStudent> entry : studentInfo.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println();

        studentInfo.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println();

        Iterator<String> iterator = studentInfo.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            OtherStudent value = studentInfo.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

class OtherStudent {
    private String firstName;
    private String lastName;
    private double gpa;

    public OtherStudent(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "OtherStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
