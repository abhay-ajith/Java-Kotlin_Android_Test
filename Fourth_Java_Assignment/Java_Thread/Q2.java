package Java_Thread;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Create instances of the threads
        Thread evenThread = new EvenThread();
        Thread oddThread = new OddThread();

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}