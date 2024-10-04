import java.util.Scanner;

public class Class02_10_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalculateSimpleIntrest(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
    }

    public static double CalculateSimpleIntrest(double P, double R, double T){
        return (P*R*T) / 100;
    }
/*
    public static double CalculateVolume(double r, double h){
        double volume = Math.PI * r * r * h;
        return volume;
    }

    public static double SolveEquation(double a, double b){
        double x = -b / a;
        return x;
    }

    public static void GetBaseAndExponent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("Result: " + CalculatePower(base, exponent));

    }

    public static double CalculatePower(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public static double getCircleRadius() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static double CalculateArea(){
        double radius = getCircleRadius();
        double area = Math.PI * radius * radius;
        return area;
    }

 */
}
