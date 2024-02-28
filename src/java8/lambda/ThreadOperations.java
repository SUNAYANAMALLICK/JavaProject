package java8.lambda;

public class ThreadOperations {

    public static void oldWay() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

    }

    public static void usingLambda() {
        Runnable runnable = () -> System.out.println("Hello World");

    }

    public static void main(String[] args) {
        oldWay();
        usingLambda();

        String day = "Monday";
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
        }


    }
}
