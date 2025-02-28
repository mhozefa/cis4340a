public class R13_CON04_J {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(R13_CON04_J::incrementCounter);
        Thread t2 = new Thread(R13_CON04_J::incrementCounter);

        t1.start();
        t2.start();
    }

    private static synchronized void incrementCounter() {
        for (int i = 0; i < 5; i++) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
        }
    }
}
