package principle.solid.liscov.violation;

class Rectangle{
    private int height;
    private int width;
    public int area(){
        return height*width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Square extends Rectangle{
    private int height;

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return height*height;
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(10);

        System.out.println(String.format("Rectangle[%d,%d] = Area[%d]",rectangle.getHeight(), rectangle.getWidth(), rectangle.area()));

        Rectangle square = new Square();
        square.setHeight(4);
        square.setWidth(11);

        System.out.println(String.format("Square[%d] = Area[%d]",square.getHeight(),  square.area()));

    }
}