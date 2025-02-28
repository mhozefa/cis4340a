import java.io.*;

public class R14_SER03_J implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;

    public R14_SER03_J(String data) {
        this.data = data;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("Deserialization is not allowed for security reasons.");
    }

    public static void main(String[] args) {
        System.out.println("Secure serialization implemented.");
    }
}
