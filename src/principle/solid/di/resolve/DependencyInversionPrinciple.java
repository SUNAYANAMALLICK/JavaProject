package principle.solid.di.resolve;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Switchable light = new Light();

        Switch lightSwitch = new Switch(light);
        lightSwitch.operate("on");
        lightSwitch.operate("off");

        Switch fanSwitch = new Switch(new Fan());
        fanSwitch.operate("on");
        fanSwitch.operate("off");
    }
}