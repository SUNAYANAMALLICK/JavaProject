package core.multithreading.fileprocessing;

import java.io.*;

public class FileProcessor implements Runnable {
    private String filePath;
    // Constructor to initialize file path
    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Error processing file: " + filePath);
            e.printStackTrace();
        }
    }

    private void processFile() throws IOException {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        int lineCount = 0;

        // Reading file line by line
        while ((line = reader.readLine()) != null) {
            lineCount++;
        }
        reader.close();

        // Simulate some data processing (e.g., counting lines)
        System.out.println(Thread.currentThread().getName() + " processed " + file.getName() + " with " + lineCount + " lines.");

    }
}
