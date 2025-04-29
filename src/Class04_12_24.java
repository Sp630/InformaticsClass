public class Class04_12_24 {
    /*
    public static void main(String[] args) {
        Habitat savanna = new Habitat("Savanna", "medium", 27);
        Habitat grassland = new Habitat("Grassland", "large", 16);
        Habitat aquarium = new Habitat("Aquarium", "small", 5);
        Habitat evergreenForest = new Habitat("Evergreen Forest", "large", 5);

        Animal crocodile = new Animal("Croko", "crocodile", 10, savanna);
        Animal elephant = new Animal("Milcho", "elephant", 5, grassland);
        Animal octopus = new Animal("Side-eye", "octopus", 4, aquarium);
        Animal tiger = new Animal("Marian", "tiger", 7, evergreenForest);

        Zoo zoo = new Zoo();
        zoo.addAnimal1(crocodile);
        zoo.addAnimal2(elephant);
        zoo.addAnimal3(octopus);
        zoo.addAnimal4(tiger);

        Staff Martin = new Staff("Martin", "zookeeper");
        Staff Kiro = new Staff("Kiro", "specialist");
        Staff Dimitrinka = new Staff("Dimitrinka", "zookeeper");
        Staff Temenuzka = new Staff("Temenuzka", "specialist");

        Martin.assignStaff(savanna);
        Kiro.assignStaff(evergreenForest);
        Dimitrinka.assignStaff(grassland);
        Temenuzka.assignStaff(aquarium);



        crocodile.eat("meatballs", Martin);
        elephant.eat("salad", Dimitrinka);
        octopus.eat("mussels", Temenuzka);
        tiger.eat("random pedestrians", Kiro);

    }
}

class Animal{
    private String name;
    private String species;
    private int age;
    private Habitat habitat;
    public Animal(String name, String species, int age, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }
    public void eat(String food, Staff staff){
        System.out.println(name + " is fed " + food + " by " + staff.name + ".");
    }
}

class Habitat{
    String type;
    String size;
    double temperature;
    public Habitat(String type, String size, double temperature) {
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }
}

class Zoo{
    Animal a1;
    Animal a2;
    Animal a3;
    Animal a4;
    void addAnimal1(Animal animal){
        a1 = animal;
    }
    void addAnimal2(Animal animal){
        a2 = animal;
    }
    void addAnimal3(Animal animal){
        a3 = animal;
    }
    void addAnimal4(Animal animal){
        a4 = animal;
    }
}

class Staff{
    String name;
    String role;
    Habitat assignedHabitat;
    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }
    void assignStaff(Habitat habitat){
        assignedHabitat = habitat;
        System.out.println(name + " is assigned to " + habitat.type + ".");
    }

     */
}
