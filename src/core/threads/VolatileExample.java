package core.threads;

public class VolatileExample {

    private volatile boolean flag = false;

    public void setFlag(boolean value) {
        this.flag = value;
    }

    public boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        // Thread 1: Modifying the volatile variable
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is setting flag to true");
            example.setFlag(true);
            try {
                Thread.sleep(10000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2: Reading the volatile variable
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is reading flag");
            while (!example.isFlag()) {
                System.out.println("Busy wait until flag becomes true");
            }
            System.out.println("Thread 2: Flag is now true");
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}
