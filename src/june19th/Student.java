package june19th;
import java.util.ArrayList;
import java.util.List;
public class Student{
    public static class StudentGpa {
        final String firstName;
        final String lastName;
        final double gpa;
        public StudentGpa(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }
        public double getGpa() {
            return gpa;
        }
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<StudentGpa> students = new ArrayList<>();
        students.add(new StudentGpa("Jahnavi", "k", 3.5));
        students.add(new StudentGpa("abzx", "asnjk", 4.2));
        students.add(new StudentGpa("ahg", "abc", 2.8));
        students.add(new StudentGpa("bsh", "sjah", 3.9));

        // Calculate the average GPA
        double averageGpa = students.stream()
                .mapToDouble(StudentGpa::getGpa)
                .average()
                .orElse(0.0);

        // Remove students with GPA less than the average
        List<StudentGpa> remainingStudents = students.stream()
                .filter(student -> student.getGpa() >= averageGpa)
                .toList();

        // Print the remaining students
        remainingStudents.forEach(System.out::println);
    }
}
