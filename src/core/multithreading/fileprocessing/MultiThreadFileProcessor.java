package core.multithreading.fileprocessing;

import java.util.StringJoiner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadFileProcessor {
    public static void main(String[] args) {
        // List of files to process
        String[] files = {
                "file1.txt",
                "file2.txt",
                "file3.txt",
                "file4.txt"
        };

        StringBuilder homeDirectory = new StringBuilder(System.getProperty("user.dir"));
        homeDirectory.append("/src/core/multithreading/fileprocessing/");

        // ExecutorService to manage a pool of threads
        ExecutorService executor = Executors.newFixedThreadPool(3);  // 3 threads in the pool

        // Submitting each file processing task to a thread
        for (String filePath : files) {
            FileProcessor task = new FileProcessor(homeDirectory +filePath);
            executor.submit(task);// Submit the task to the thread pool
        }

        // Shut down the executor service after tasks are completed
        executor.shutdown();
    }
}
