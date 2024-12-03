
class Students {
    private String name;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    private String school;
    public Students(String studentName, String lastName, int gradeLevel, double gpa, String school){
        this.name = studentName;
        this.lastName = studentName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.school = school;
    }
    boolean isHonorStudent() {
        if(gpa>3.8){
            ComposeEmail();
        }
        return gpa>3.8;
    }
    void ComposeEmail(){
        System.out.println("Dear" + name + ", you are selected as one of the honor students of " + school + " in class 2023 with the GPA of " + gpa + ". Congratulations and we look forward to celebrating your achievement in the graduation ceremony.\n");
    }

    void displayInfoInText(){
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("School: " + school);
        System.out.println("***********************");
    }

}

public class Class27_11_24 {
    public static void main(String[] args) {
        Students stu1 = new Students("Martin", "Martinov", 10, 4.0, "BUZEMA");
        Students stu2 = new Students("Aleksander", "Karahadjihristoivanow", 9, 3.5,"BUZEMA");

        stu1.displayInfoInText(); // use of a non-static method
        stu2.displayInfoInText();

        stu1.isHonorStudent();
        stu2.isHonorStudent();
    /*
2. Static Methods:
    A static method belongs to the class rather than an instance of the class.
    It can be called using the class name without creating an instance of the class.

    Example:
    */
    }
    public static void add(int n1, int n2){
        System.out.println(n1 + n2);
    }
}