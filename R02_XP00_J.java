import java.io.File;

public class R02_XP00_J {
    public static void main(String[] args) {
        deleteFile("someFileName.txt");
    }

    public static void deleteFile(String fileName) {
        File someFile = new File(fileName);
        if (!someFile.delete()) {
            System.err.println("Failed to delete file: " + fileName);
        } else {
            System.out.println("File deleted successfully: " + fileName);
        }
    }
}
