package principle.solid.di.resolve;

public interface Switchable {
    default void on(String device) {
        System.out.println(device + " Switched-on");
    }

    default void off(String device) {
        System.out.println(device + " Switched-off");
    }
}
