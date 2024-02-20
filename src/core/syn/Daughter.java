package core.syn;

public class Daughter extends Parent{
    @Override
    public  void synchronizedMethod() {
        System.out.println(" non - synchronizedMethod - Daughter");
    }

    @Override
    public synchronized void synchronizedMethod2() {
        super.synchronizedMethod2();
    }
}
