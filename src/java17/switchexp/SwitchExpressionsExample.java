package java17.switchexp;

public class SwitchExpressionsExample {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        // Traditional switch statement
        String typeOfDay;
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Weekday";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + today);
        }
        System.out.println("Traditional switch: Today is a " + typeOfDay);

        // Switch expression (Java 14+)
        String typeOfDayExpression = switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
            default -> throw new IllegalStateException("Unexpected value: " + today);
        };
        System.out.println("Switch expression: Today is a " + typeOfDayExpression);
    }
}
