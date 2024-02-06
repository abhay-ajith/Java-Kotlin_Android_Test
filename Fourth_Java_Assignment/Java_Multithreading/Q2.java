package Java_Multithreading;

class SharedBuffer {
    private int data;
    private boolean available = false;

    // Synchronized method
    public synchronized void produce(int newData) {
        while (available) {
            try {
                wait(); // Wait if the buffer is not empty
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        data = newData;
        available = true;
        System.out.println("Produced: " + data);

        notify(); // Notify the consumer that data is available
    }

    // Synchronized method for the consumer to take data from the buffer
    public synchronized int consume() {
        while (!available) {
            try {
                wait(); // Wait if the buffer is empty
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        available = false;
        System.out.println("Consumed: " + data);

        notify(); // Notify the producer that space is available

        return data;
    }
}

class ProducerThread extends Thread {
    private SharedBuffer sharedBuffer;

    public ProducerThread(String name, SharedBuffer sharedBuffer) {
        super(name);
        this.sharedBuffer = sharedBuffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedBuffer.produce(i);
        }
    }
}

class ConsumerThread extends Thread {
    private SharedBuffer sharedBuffer;

    public ConsumerThread(String name, SharedBuffer sharedBuffer) {
        super(name);
        this.sharedBuffer = sharedBuffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedBuffer.consume();
        }
    }
}



public class Q2 {
    public static void main(String[] args) {
        // Create a shared buffer
        SharedBuffer sharedBuffer = new SharedBuffer();

        // Create and start producer and consumer threads
        Thread producerThread = new ProducerThread("Producer", sharedBuffer);
        Thread consumerThread = new ConsumerThread("Consumer", sharedBuffer);

        producerThread.start();
        consumerThread.start();
    }
}

