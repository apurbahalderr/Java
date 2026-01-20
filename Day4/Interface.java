// Interface
interface Motor {
    int capacity = 5; 

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power");
    }
}

public class Interface {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        System.out.println("Capacity of the motor is " + WashingMachine.capacity);
    }
}
