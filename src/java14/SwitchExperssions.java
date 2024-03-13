package java14;

public class SwitchExperssions {

    public static String getDayOfWeek(int day){
        String dayOfWeek = null;
        switch (day){
            case 0:
                dayOfWeek = "Sunday"; break;
            case 1:
                dayOfWeek = "Monday"; break;
            case 2:
                dayOfWeek = "Tuesday"; break;
            case 3:
                dayOfWeek = "Wednesday"; break;
            case 4:
                dayOfWeek = "Thursday"; break;
            default: throw new IllegalArgumentException("Invalid Day %d".formatted(day));

        }
        return  dayOfWeek;
    }

    public static String getDayOfWeekSwitchExpressions(int day){
        String dayOfWeek =
        switch (day){
            case 0 -> {
                System.out.println("Some complex logic");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default ->  throw new IllegalArgumentException("Invalid Day %d".formatted(day));

        };
        return  dayOfWeek;
    }
    public static void main(String[] args) {

        System.out.println(getDayOfWeek(0));
        System.out.println(getDayOfWeek(3));
        System.out.println(getDayOfWeekSwitchExpressions(4));


    }
    }
