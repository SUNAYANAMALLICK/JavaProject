package core.synchronisation;

public class Son extends Parent{
    @Override
    public synchronized void synchronizedMethod() {
        System.out.println(" non - synchronizedMethod - Son");
    }

    public  void nonsynchronizedMethod() {
        System.out.println(" non - synchronizedMethod - Son");

    }

}
