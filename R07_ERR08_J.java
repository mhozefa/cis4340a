import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class R07_ERR08_J {
    public static void main(String[] args) {
        readFile("non_existent_file.txt");
    }

    public static void readFile(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please check the path and try again.");
        }
    }
}
