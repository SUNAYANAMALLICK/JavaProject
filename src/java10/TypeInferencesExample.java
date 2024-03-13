package java10;

import java.util.List;
import java.util.stream.Stream;

public class TypeInferencesExample {
    public static void main(String[] args) {

        List<String> names1 = List.of("Sunayana","Mallick");
        List<String> names2 = List.of("Tuhin","Chandra");
        List<String> names3 = List.of("Spriha","Chandra");

        List<List<String>> finalString = List.of(names1,names2,names3);

        System.out.println(finalString);

        var newfinalString =  List.of(names1,names2,names3);

        System.out.println(newfinalString);

        for(var name : names1)
            System.out.println(name);

        Stream<String> var = List.of("Sunayana", "Mallick").stream().filter(s -> s.startsWith("S"));
        var.forEach(System.out::println);


    }
    }
