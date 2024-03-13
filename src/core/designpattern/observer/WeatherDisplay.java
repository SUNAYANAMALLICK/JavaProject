package core.designpattern.observer;

public class WeatherDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature updated: " + temperature);
    }
}