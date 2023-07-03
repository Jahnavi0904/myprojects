package InputOutputfunctions;

 import java.time.LocalDate;
 import java.util.ArrayList;
 import java.util.List;

public class DateRange {

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2023, 6, 30));
        dates.add(LocalDate.of(2023, 7, 1));
        dates.add(LocalDate.of(2023, 7, 2));
        dates.add(LocalDate.of(2023, 7, 3));

        LocalDate earliestDate = dates.stream()
                .min(LocalDate::compareTo)
                .orElse(null);

        LocalDate latestDate = dates.stream()
                .max(LocalDate::compareTo)
                .orElse(null);

        System.out.println("Earliest date: " + earliestDate);
        System.out.println("Latest date: " + latestDate);
    }
}
