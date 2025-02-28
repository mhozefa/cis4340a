import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static void main(String[] args) throws IOException {
        byte[] inputData = {0, 0, 0, 42}; // sample input stream
        DataInputStream dataStream = new DataInputStream(new ByteArrayInputStream(inputData));
        System.out.println("Unsigned Integer Value: " + getInteger(dataStream));
    }

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; 
    }
}
