import java.io.*;

public class R09_FIO02_J {
    public static void main(String[] args) {
        readFile("sample.txt");
    }

    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("I/O error occurred: " + e.getMessage());
        }
    }
}
