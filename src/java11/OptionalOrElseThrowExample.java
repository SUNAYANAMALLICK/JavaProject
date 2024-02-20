package java11;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        String result = name.orElseThrow(() -> new RuntimeException("Name not found"));
        System.out.println(result);
    }
}
