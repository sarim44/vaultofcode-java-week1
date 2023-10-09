package internshipvoc;
/* Error fix
In the main method ,the car object is calling method stop which
doesnt exist , so we have to add stop method
 */
// Vault of Codes Java intersnhip p2
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the car.");
    }
//creating stop method
    public void stop() {
        System.out.println("Stopping the car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();
    }
}