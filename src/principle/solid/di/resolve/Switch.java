package principle.solid.di.resolve;

public class Switch {
    private final Switchable device ;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String action) {
        if ("on".equals(action)) {
            device.on(device.getClass().getSimpleName());
        } else if ("off".equals(action)) {
            device.off(device.getClass().getSimpleName());
        }
    }

}
