package principle.solid.isp.resolve;

interface WorkOperation{
    void work();
}
interface EatOperation{
    void eat();

}
interface SleepOperation{
    void sleep();

}

class Human implements WorkOperation, EatOperation, SleepOperation {

    @Override
    public void work() {
        System.out.println("Can do work.");
    }

    @Override
    public void eat() {
        System.out.println("Can eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Can sleep.");
    }
}

class Robot implements WorkOperation{
    @Override
    public void work() {
        System.out.println("Can do work.");
    }

}
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Human");
        human.eat();
        human.work();
        human.sleep();
        Robot robot = new Robot();
        System.out.println("Robot");
        robot.work();

    }
}
