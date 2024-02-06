package Java_Thread;

public class Q1 extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {

        // Create an instance of the thread
        Q1 helloThread = new Q1();

        // Start the thread
        helloThread.start();
    }
}