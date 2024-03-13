package coding.exercises.redwood;

public class Test {
    public static final Test test = new Test();
    private static final int number = 10;

    public Test() {
    }

    public int getVal() {
        return number + 10;
    }

    public static void main(String[] args) {
        System.out.println(test.getVal());
    }
}
