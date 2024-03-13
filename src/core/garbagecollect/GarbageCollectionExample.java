package core.garbagecollect;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Creating an object
        MyClass obj1 = new MyClass();

        // Creating another object and assigning the reference to obj2
        MyClass obj2 = new MyClass();

        // Assigning obj1 reference to null
        obj1 = null;

        // Now, the object created by obj1 is unreachable and eligible for garbage collection

        // Calling garbage collector explicitly (not recommended in production code)
        System.gc(); // This requests garbage collection but does not guarantee immediate execution
    }
}
