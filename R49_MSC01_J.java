import java.security.SecureRandom;
import java.util.Random;

public class R49_MSC01_J {
    public static void main(String[] args) {
        // Insecure approach (DO NOT USE for security-sensitive applications)
        Random insecureRandom = new Random();
        System.out.println("Insecure random number: " + insecureRandom.nextInt());

        // Secure approach
        SecureRandom secureRandom = new SecureRandom();
        System.out.println("Secure random number: " + secureRandom.nextInt());
    }
}
