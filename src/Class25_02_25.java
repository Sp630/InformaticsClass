import java.util.Scanner;

public class Class25_02_25 {
    public static void main(String[] args) {
        Car1[] cars = {
                new Car1("Chevrolet", "Camaro", 2010, 30000, false),
                new Car1("Mazda", "Miata", 2005, 20000, true),
                new Car1("Ferrari", "812 Superfast", 2007, 40000, false),
                new Car1("Porsche", "Cayman GT4", 2007, 70000, false)
        };

        DisplayCars(cars);
        DisplayMostExpensive(cars);
        ReturnAveragePrice(cars);
        Lease(cars);


    }
    public static void DisplayCars(Car1[] cars) {
        for (Car1 car : cars) {
            car.DisplayInfo();
        }
    }
    public static void DisplayMostExpensive(Car1[] cars){
        double max = 0;
        for (Car1 car : cars) {
            if(car.price > max){
                max = car.price;
            }
        }
        System.out.println("Most expensive car: ");
        for (Car1 car : cars) {
            if(car.price == max){
                car.DisplayInfo();
            }
        }
    }
    public static void Lease(Car1[] cars){
        System.out.println("Enter the model of a car to lease: ");
        Scanner scan = new Scanner(System.in);
        String carName = scan.nextLine();
        for (Car1 car : cars) {
            if(car.model.equalsIgnoreCase(carName)){
                if(car.isLeased == false){
                    car.isLeased = true;
                    System.out.println("Leased car: ");
                    car.DisplayInfo();
                }
                else {
                    System.out.println("Car is already leased");
                }
            }
        }
    }
    public static void ReturnAveragePrice(Car1[] cars){
        double sum = 0;
        for (Car1 car : cars) {
            sum += car.price;
        }
        System.out.println("Average price: " + sum/cars.length + "$");
    }
}
class Car1{
    String make;
    String model;
    int year;
    double price;
    boolean isLeased;
    public Car1(String make, String model, int year, double price, boolean isLeased){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isLeased = isLeased;
    }
    public void DisplayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price + "$");
        System.out.println("isLeased: " + isLeased);
    }
}
