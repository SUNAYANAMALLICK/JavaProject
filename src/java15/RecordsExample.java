package java15;

public class RecordsExample {

    record Person(String name, String email, Long contactNumber){

        // can create constructor also
        Person{
            if(name==null)
                throw new IllegalArgumentException("Invalid Name");
        }
    };
    public static void main(String[] args) {

        Person person = new Person("Sunayana MAllick","sunayana.mallick@outlook.com", 9836377790L);
        Person person1 = new Person("Sunayana MAllick","sunayana.mallick@outlook.com", 9836377790L);

        System.out.println(person);
        System.out.println(person==person1);
        System.out.println(person.equals(person1));

        System.out.println(person.name());

    }
    }
