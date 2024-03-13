package core.synchronisation;

public class Parent {
    public synchronized void synchronizedMethod() {
        System.out.println(" synchronizedMethod - Parent");
    }

    public synchronized void synchronizedMethod2() {
        System.out.println(" synchronizedMethod2 - Parent");
    }
}
