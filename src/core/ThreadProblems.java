package core;

public class ThreadProblems {

    static int count = 0 ;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

       ThreadProblems threadProblems = new ThreadProblems();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                threadProblems.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                threadProblems.increment();
            }
        });

        // Start the threads.
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish.
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count value.
        System.out.println("Final Count: " + threadProblems.getCount());

    }
}
