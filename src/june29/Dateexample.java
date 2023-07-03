package june29;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dateexample {
    public static int calculateWorkingDays(LocalDate startDate) {
        int workingDays = 0;
        LocalDate currentDate = startDate;
        LocalDate lastDayOfMonth = startDate.withDayOfMonth(startDate.lengthOfMonth());

        while (currentDate.isBefore(lastDayOfMonth) || currentDate.isEqual(lastDayOfMonth)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workingDays;
    }

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 7, 1);
        int workingDays = calculateWorkingDays(startDate);
        System.out.println("Number of working days: " + workingDays);
    }
}
