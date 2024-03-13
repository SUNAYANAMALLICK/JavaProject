package core.multithreading;

public class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to decrement the counter
    public synchronized void decrement() {
        count--;
    }

    // Method to get the current value of the counter
    public synchronized int getCount() {
        return count;
    }
}

