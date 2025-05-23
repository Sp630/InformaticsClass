public class compositionTask {
    public static void main(String[] args) {
        // Task 5: Create an Engine object with a type of "V8".
        Engine engine = new Engine("V8");

        // Task 6: Create a Car object with the brand "Ford", the Engine object, and wheel size of 18 inches.
        Car car = new Car("Golf", engine, 18);

        // Task 7: Call the displayInfo() method to print the car's details.
        car.displayInfo();
    }
}

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class Car {
    private String brand;
    private Engine engine;
    private Wheel frontLeftWheel;  // Task 1: Add three more wheel objects (frontRightWheel, rearLeftWheel, rearRightWheel).
    private Wheel frontRightWheel;
    private Wheel backLeftWheel;
    private Wheel backRightWheel;

    public Car(String brand, Engine engine, int wheelSize) {
        this.brand = brand;
        this.engine = engine;

        // Task 2: Initialize all the Wheel objects inside the constructor.
        this.frontLeftWheel = new Wheel(wheelSize);
        this.frontRightWheel = new Wheel(wheelSize);
        this.backLeftWheel = new Wheel(wheelSize);
        this.backRightWheel = new Wheel(wheelSize);
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Front Left Wheel Size: " + frontLeftWheel.getSize() + " inches");
        System.out.println("Front Right Wheel Size: " + frontRightWheel.getSize() + " inches");
        System.out.println("Back Left Wheel Size: " + backLeftWheel.getSize() + " inches");
        System.out.println("Back Right Wheel Size: " + backRightWheel.getSize() + " inches");


        // Task 3: Add print statements for the sizes of the other three wheels.
    }

    // Task 4: Write a getter method for the 'brand' field.
    public String getBrand() {
        return brand;
    }
}