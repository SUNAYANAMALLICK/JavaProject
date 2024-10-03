package coding.exercises.persistent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingTest03102024 {

    static List<Person> persons = new ArrayList();


    static {

        Person p1 = new Person("Sunayana",35);
        Person p2 = new Person("Tuhin",35);
        Person p3 = new Person("Spriha",4);
        Person p4 = new Person("Sukhen",65);
        Person p5 = new Person("Mithuya",60);

        persons.addAll(List.of(p1,p2,p3,p4,p5));


    }



    public static void main(String[] args) {

        // Person (name,age)



         ///add
        // output hashMap< 1-5, 5>

        persons.stream().forEach(person->System.out.println(person.toString()));

        Map<Integer,Long> map = persons.stream().sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));

        System.out.println(map);

        Map<String, Long> ageRangeMap = persons.stream()
                .collect(Collectors.groupingBy(
                        person -> getAgeRange(person.getAge()),  // Map age to range
                        Collectors.counting()                   // Count persons in each range
                ));

        System.out.println(ageRangeMap);


        // put --> 1, Value1
        // put --> 1,
        // 0 --> Value1
        // 1, Value2

        // Cab (category, id, driver) + User (id, name, postcode) +Booking
        // Area

        // postcode.io --> SO15 7BH -- Users Locations
        // python --> output List<Cabs>
        // restapi
        // input --> resource --> validity -> List<Cabs> --> List<Cabs>

        // @RestController
        // @Autowired
        // @Valid
        // POST --> add --> /cab @POST(value="", input=Multipartfile/JSON) // creating new resource
        // PUT --> /cab
        // GET --> /cab/{id}
        // POST --> /upload/
        // GET --> /cab/booking
        // @Service
        // @Repository

        //@SpringBootTest
        //@Mock -->Service
        //@InjectMock -->Repository

        //SonarCobe, CheckStyle
        //80%

        // File() -->
        //




    }

    private static String getAgeRange(int age) {
        return switch (age) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "0-10";
            case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> "11-20";
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 -> "21-30";
            case 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 -> "31-40";
            case 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 -> "41-50";
            case 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 -> "51-60";
            case 61, 62, 63, 64, 65, 66, 67, 68, 69, 70 -> "61-70";
            case 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 -> "71-80";
            default -> "81+";
        };
    }
}
