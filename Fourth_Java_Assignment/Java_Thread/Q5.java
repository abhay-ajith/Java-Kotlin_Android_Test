package Java_Thread;

public class Q5 {
    public static void main(String[] args) {
        int limit = 1000;
        long sum = parallelSumOfPrimes(limit);
        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    }

    public static long parallelSumOfPrimes(int limit) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        PrimeSumThread[] threads = new PrimeSumThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new PrimeSumThread(limit, i + 1, numThreads);
            threads[i].start();
        }

        long sum = 0;
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
                sum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }
}

class PrimeSumThread extends Thread {
    private final int limit;
    private final int start;
    private final int step;
    private long sum;

    public PrimeSumThread(int limit, int start, int step) {
        this.limit = limit;
        this.start = start;
        this.step = step;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= limit; i += step) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }
}
