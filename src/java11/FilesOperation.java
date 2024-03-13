package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesOperation {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

    }
}
