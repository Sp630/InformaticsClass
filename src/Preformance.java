public class Preformance {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kiro", "Dikov", "566787", 13000, 4.9);
        Employee e2 = new Employee("Miro", "Kirov", "787665", 15000, 4.1);
        e1.CalculateBonus();
        e2.CalculateBonus();
    }
}
class Employee {
    private String name;
    private String lastName;
    private String employeeID;
    private double salary;
    private double performanceRating;

    public Employee(String studentName, String lastName, String employeeID, double salary, double performanceRating){
        this.name = studentName;
        this.lastName = studentName;
        this.employeeID = employeeID;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }
    boolean isHighPerformer() {
        if(performanceRating>4.5){
            ComposeEmail();
        }
        return performanceRating>4.5;
    }
    void CalculateBonus() {
        if(isHighPerformer()){
            salary += 0.2 * salary;
        }
        else {
            salary += 0.05 * salary;
        }
    }
    void ComposeEmail(){
        System.out.println("Dear " + name + " ,\nBased on your performance rating of " + performanceRating + ", you are a valued member of our team.\n" +
                "Your bonus for this period is " + 0.20*salary + "$. Keep up the great work!");
    }


}