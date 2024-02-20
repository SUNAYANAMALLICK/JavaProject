package java11;

public class OuterClass {
    private int outerValue = 10;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class NestedClass {
        private int nestedValue = 20;

        public void nestedMethod() {
            System.out.println("Nested method");
            System.out.println("Accessing outer value: " + outerValue);
            outerMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.NestedClass nested = outer.new NestedClass();

        nested.nestedMethod();
    }
}

