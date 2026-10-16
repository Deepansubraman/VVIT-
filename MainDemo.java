interface RemoteControl {
    void turnOn();
    void turnOff();

    default void fuel() {
        System.out.println("Vehicle is fueling");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

class AC implements RemoteControl {
    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

public class MainDemo {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        tv.turnOn();
        tv.turnOff();
        tv.fuel(); // prints "Vehicle is fueling"

        RemoteControl ac = new AC();
        ac.turnOn();
        ac.turnOff();
        ac.fuel(); // prints "Vehicle is fueling"
    }
}
