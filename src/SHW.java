import java.io.*;

public class SHW {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(13496, "Packo", 13000);
        try(ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("employees.txt"))) {
            dos.writeObject(emp);
        }
        catch(Exception e) {

        }
        try(ObjectInputStream dos = new ObjectInputStream(new FileInputStream("employees.txt"))) {
            Employee1 emp1 = (Employee1) dos.readObject();
            System.out.println("Id: " + emp1.id);
            System.out.println("Name: " + emp1.name);
            System.out.println("Salary: " + emp1.salary);

        }
        catch(Exception e) {

        }
    }
}

class Employee1 implements Serializable {
    int id;
    String name;
    double salary;
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
