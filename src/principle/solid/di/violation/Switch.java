package principle.solid.di.violation;

import principle.solid.di.violation.Light;

public class Switch {
    private final Light light = new Light();

    public void operate(String action) {
        if ("on".equals(action)) {
            light.on();
        } else if ("off".equals(action)) {
            light.off();
        }
    }

}
