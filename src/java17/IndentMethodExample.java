package java17;

import java.util.Optional;

public class IndentMethodExample {
    public static void main(String[] args) {

        String text = "Like and Subscribe";
        System.out.println(text);
        System.out.println(text==text.indent(4));
        System.out.println(text.indent(-2));
        System.out.println(text.indent(2));
        System.out.println(Optional.of(text.transform(str -> str.substring(3))).get());

    }
    }
