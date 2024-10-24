package coding.exercises.infosys.uk;

public class Rectangle  extends Operations{

    private  int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getArea(){
        return getA() * getB();
    }

}
