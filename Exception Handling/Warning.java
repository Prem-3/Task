import java.util.*;
import java.io.*;

public class Warning {
    public static boolean warning(double gpa, int creditHrs) {
        return ((creditHrs < 30 && gpa < 1.5) || (creditHrs < 60 && gpa < 1.75) || (gpa < 2.0));
    }

    public static void main(String[] args) {
        int creditHrs;
        double qualityPts;
        double gpa;
        String line, inputName = "Students.dat";
        String[] info;

        String outputName = "warning.dat";

        try (Scanner scanner = new Scanner(new File(inputName))) {
            try (FileWriter writer = new FileWriter(outputName)) {
                writer.write("Students on Academic Warning\n");
                while (scanner.hasNextLine()) {

                    line = scanner.nextLine();
                    info = line.split(" ");
                    creditHrs = Integer.parseInt(info[1].trim());
                    qualityPts = Double.parseDouble(info[2].trim());
                    gpa = qualityPts / creditHrs;
                    if (warning(gpa, creditHrs))
                        writer.write(line + "\n");
                }
            }
            System.out.println("File written ");

        } catch (FileNotFoundException exception) {
            System.out.println("The file " + inputName + " was not found.");
        } catch (IOException exception) {
            System.out.println(exception);
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e);
        }

    }
}