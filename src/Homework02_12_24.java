public class Homework02_12_24 {
    public static void main(String[] args) {
        StudentsDiscount s1 = new StudentsDiscount("Paco", "5867", 15, 10000, "Full-Time", "KGBA");
        StudentsDiscount s2 = new StudentsDiscount("Geco", "8970", 56, 10000, "Full-Time", "KGBA");
        if(s1.isEligible()){
            s1.CalculateDiscount();
            s1.ComposeEmail();
        }
        if(s2.isEligible()){
            s2.CalculateDiscount();
            s2.ComposeEmail();
        }
    }
}
class StudentsDiscount {
    private String name;
    private String school;
    private String ID;
    private int age;
    private String course;
    private double tuitiounFee;
    private double discount = 0;
    public StudentsDiscount(String studentName, String ID, int age, double tuitiounFee, String course, String school){
        this.name = studentName;
        this.ID = ID;
        this.age = age;
        this.tuitiounFee = tuitiounFee;
        this.course = course;
        this.school = school;
    }
    boolean isEligible() {
        return(age<25 && course.equals("Full-Time"));

    }
    double CalculateDiscount(){
        if(isEligible()){
            discount = 0.15 * tuitiounFee;
        }
        else discount = 0;
        return discount;
    }


    void ComposeEmail(){
        System.out.println("Dear " + name + ",\nWe are pleased to inform you that you are eligible for a " + discount + "$ discount on your tuition fee for the course " + course + ". " +
                "Your discounted tuition fee is " + 0.85*tuitiounFee + ". We hope this helps in supporting your academic journey!\nBest regards, \n" + school + " Administration");
    }




}