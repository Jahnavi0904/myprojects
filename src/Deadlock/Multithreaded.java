package Deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Multithreaded{

    private static final int ARRAY_SIZE = 106;
    private static final int THREAD_COUNT = 5;

    final static int[] array = new int[ARRAY_SIZE];
    final static AtomicInteger globalSum = new AtomicInteger(0);

    public static void main(String[] args) {
        // Initialize the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        // Divide the array equally into 5 threads
        int segmentSize = ARRAY_SIZE / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * segmentSize;
            int endIndex = (i + 1) * segmentSize;
            executor.execute(new PartialSumCalculator(startIndex, endIndex));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }

        // Combine the partial sums to get the final sum
        int sum = globalSum.get();
        System.out.println("Sum of array elements: " + sum);
    }

    static class PartialSumCalculator implements Runnable {
        final int startIndex;
        final int endIndex;

        public PartialSumCalculator(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
            globalSum.addAndGet(partialSum);
        }
    }
}
