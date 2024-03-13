package core.multithreading;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads to increment and decrement the counter
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        // Start the threads
        incrementThread.start();
        decrementThread.start();

        // Wait for threads to finish execution
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final value of the counter
        System.out.println("Final count: " + counter.getCount());
    }
}

