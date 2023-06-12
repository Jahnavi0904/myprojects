package stringlibraries;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class AboutYourself{
    public static void main(String[] args) {
        String csvFile = "/Users/jahnavikatta/IdeaProjects/myprojects/src/stringlibraries/description.csv";
        List<String[]> data = readCSV(csvFile);

        // Extracting attributes from CSV data
        List<String> names = new ArrayList<>();
        List<Integer> totalExperience = new ArrayList<>();
        List<String> technologies = new ArrayList<>();
        List<String> projectMethodology = new ArrayList<>();
        List<String> domainExperience = new ArrayList<>();
        List<String> currentRoleAndProject = new ArrayList<>();
        List<String> responsibilities = new ArrayList<>();

        for (String[] row : data) {
            names.add(row[0]);
            totalExperience.add(Integer.parseInt(row[1]));
            technologies.add(row[2]);
            projectMethodology.add(row[3]);
            domainExperience.add(row[4]);
            currentRoleAndProject.add(row[5]);
        }

        // Displaying extracted attributes
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i));
            System.out.println("Total Experience: " + totalExperience.get(i));
            System.out.println("Technologies: " + technologies.get(i));
            System.out.println("Project Methodology: " + projectMethodology.get(i));
            System.out.println("Domain Experience: " + domainExperience.get(i));
            System.out.println("Current Role and Project: " + currentRoleAndProject.get(i));
            System.out.println();
        }
    }

    public static List<String[]> readCSV(String csvFile) {
        List<String[]> data = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
