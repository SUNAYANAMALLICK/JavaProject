package java11;

import java.util.Optional;

class Sample{
    String str = null;
}

public class StringExample {
    public static void main(String[] args) {
        System.out.println("".isBlank());
        System.out.println("  ".isBlank());
        System.out.println(" STR ".strip().replace(" ","@"));
        System.out.println(" STR ".stripLeading().replace(" ","@"));
        System.out.println(" STR ".stripTrailing().replace(" ","@"));
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        // Introduced in Java 12
        System.out.println(Optional.of("UPPER".transform(s -> s.substring(2))));
        System.out.println("My Name is %s".formatted("Sunayana"));

        // Introduced in Java 14

        String str = null;
       // System.out.println(str.isBlank()); // added description in Exception
        //Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "String.isBlank()" because "str" is null
        //	at java11.StringExample.main(StringExample.java:21)

        Sample sample = new Sample();
        System.out.println(sample.str.isBlank());
        //Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "String.isBlank()" because "sample.str" is null
        //	at java11.StringExample.main(StringExample.java:31)

    }
    }
