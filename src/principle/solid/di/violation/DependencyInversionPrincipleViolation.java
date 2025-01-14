package principle.solid.di.violation;

public class DependencyInversionPrincipleViolation {
    public static void main(String[] args) {
        Switch lightSwitch = new Switch();
        lightSwitch.operate("on");
        lightSwitch.operate("off");
    }

}

// add Fan/Heater
// need to add New Class as well as Modify Switch
// that violated DI Principle
