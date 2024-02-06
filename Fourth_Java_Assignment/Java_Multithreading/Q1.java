package Java_Multithreading;

class SharedCounter {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        System.out.println(Thread.currentThread().getName() + " - Incrementing counter: " + counter);
        counter++;
    }
}

class IncrementThread extends Thread {
    private SharedCounter sharedCounter;

    public IncrementThread(String name, SharedCounter sharedCounter) {
        super(name);
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sharedCounter.increment();
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        // Create a shared counter
        SharedCounter sharedCounter = new SharedCounter();

        // Create and start multiple threads
        for (int i = 1; i <= 5; i++) {
            Thread incrementThread = new IncrementThread("Thread-" + i, sharedCounter);
            incrementThread.start();
        }
    }
}