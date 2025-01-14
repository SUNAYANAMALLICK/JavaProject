package principle.solid.isp.violation;

interface Operations{
     void work();
     void eat();
     void sleep();

}

class Human implements Operations {

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

class Robot implements Operations{
    @Override
    public void work() {
        System.out.println("Can do work.");
    }

    @Override
    public void eat() {
        System.out.println("Can not eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Can not sleep.");
    }
}
public class Main {
    public static void main(String[] args) {
        Operations human = new Human();
        System.out.println("Human");
        human.eat();
        human.work();
        human.sleep();
        Operations robot = new Robot();
        System.out.println("Robot");
        robot.eat();
        robot.work();
        robot.sleep();
    }
}
