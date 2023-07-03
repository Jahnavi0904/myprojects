package june29;
 import java.time.LocalDate;
 import java.time.Period;

public class Birthday{

    public static int calculateAge(LocalDate birthdate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthdate, currentDate).getYears();
    }

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(2000, 4, 9);
        int age = calculateAge(birthdate);
        System.out.println("Age: " + age);
    }
}
