public class Class19_11_24 {
    public static void main(String[] args) {
        // Task 6: Create more objects and test the methods
        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890");
        p1.print();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404-899-9955");
        p2.print();
        Person p3 = new Person("Branimmir", "branko@gmail.com", "403-559-1985");
        p3.print();
        Person p4 = new Person("Martin", "marto@gmail.com", "723-819-9899");
        p4.print();

        // Task 8: Test the updateEmail method
        p3.UpdateEmail("thenewemail@gmail.com");
        System.out.println(p3.getEmail());

    }
}

// Define the Person class here
class Person {
    // Instance variables
    private String name;
    private String email;
    private String phoneNumber;
    private int age;

    // Task 1: Add a new attribute (e.g., age)

    // Constructor: Initialize Person data
    public Person(String initName, String initEmail, String initPhone, int initAge) { // Task 2: modify method signature to include your new attribute.
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;

    }
    public Person(String initName, String initEmail, String initPhone) { // Task 2: modify method signature to include your new attribute.
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        // Task 3: Assign a default value to the new attribute here.
        age = 21;

    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);

        // Task 4: Print the new attribute here
        System.out.println("Age: " + age);
    }

    // Task 5: Add getter methods to access and return each attribute individually. Here's an example:
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }

    // Task 7: Add a method to update the email
    public void UpdateEmail(String newEmail) {
        email = newEmail;
    }

}
