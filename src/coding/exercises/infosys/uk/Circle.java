package coding.exercises.infosys.uk;

public class Circle extends Operations{

    private  int a;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getArea(){
        return 22/4 * getA() * getA();
    }

}
