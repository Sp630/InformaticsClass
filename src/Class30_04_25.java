import java.util.ArrayList;
import java.util.List;

public class Class30_04_25 {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Chiken("chicken", "Chuck", "Corn Farmer", 2));
        animals.add(new Bull("bull", "Antonio", "Financial Advisor", 4));
        animals.add(new Cat("cat", "Bagi", "Protector of the Holy Grounds", 4));
        for (Animals animal : animals){
            animal.DisplayDetails();
            animal.Toil();
            animal.Eat();
        }
    }
}

class Animals {
    int numLegs;
    String type;
    String name;
    String job;
    public Animals(String type, String name, String job, int numLegs) {
        this.type = type;
        this.name = name;
        this.job = job;
        this.numLegs = numLegs;
    }

    public void DisplayDetails(){
        System.out.println(name + " the " + type + " has " + numLegs + " legs. He works as a " + job + ".");
    }
    public void Toil(){

    }
    public void Eat(){

    }
}
class Chiken extends Animals{
    public Chiken(String type, String name, String job, int numLegs) {
        super(type, name, job, numLegs);
    }
    @Override
    public void Toil(){
        System.out.println("Brother " + name + " toils in the endless fields of corn...Official job title: " + job + ".");
    }
    @Override
    public void Eat(){
        System.out.println("Brother "+ name +" has seen no feast in the last three winters since the hail gets ever more persistent in destroying his crops. Yet brother " + name + "'s resolve never fails as he hopes for brighter days.");

    }
}

class Bull extends Animals{
    public Bull(String type, String name, String job, int numLegs) {
        super(type, name, job, numLegs);
    }
    @Override
    public void Toil(){
        System.out.println("Brother " + name + " toils in the unforgiving cubicle. He is a " + job + ".");
    }
    @Override
    public void Eat(){
        System.out.println("Brother " + name + " eats no meat for he sees the bright future in the ways of vegetarianism.");
    }
}

class Cat extends Animals{
    public Cat(String type, String name, String job, int numLegs) {
        super(type, name, job, numLegs);
    }
    @Override
    public void Toil(){
        System.out.println("Brother " + name + " strikes fear in heart of any who dares oppose the sacred decrees of the overseers. Official job title: " + job + ".");
    }
    @Override
    public void Eat(){
        System.out.println("Brother " + name + " takes pleasure in drinking the blood of the enemy. Victory over the forces of doom is the only sustenance he needs.");
    }
}
