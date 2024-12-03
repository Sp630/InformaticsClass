public class Class03_12_24 {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Dwarf dwarf = new Dwarf("Thorin",100,10,7);
        // Task 5: Create an object/instance of your new character's class.

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(dwarf.getName()+"'s health: " + dwarf.getHealth());
        System.out.println("Game is starting...");
        wizard.setHealth(warrior.getSword());
        System.out.println( warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());

        // Task 6: make the wizard attack your new character.
        dwarf.setHealth(wizard.getDarkMagic());
        System.out.println( wizard.getName()+" attacks " + dwarf.getName() + ". Health updated: " + dwarf.getHealth());

        // Task 7: display the new stats
        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(dwarf.getName()+"'s health: " + dwarf.getHealth());


        // CHALLENGE: Update your program for all the characters to be able to attack each other.
        //Done
    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public String getName() {
        return name;
    }

    public int getDarkMagic(){
        return darkMagic;
    }

    public void setHealth(int damage) {
        health = health - (damage - wizardArmor);
    }

    public int getHealth() {
        return health;
    }

}

class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public String getName() {
        return name;
    }

    public int getSword() {
        return sword;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int damage) {
        health = health - (damage - metalArmor);
    }

}

class Dwarf {
    private String name;
    private int health;
    private int hammer;
    private int dragonicArmor;

    public Dwarf(String name, int health, int hammer, int dragonicArmor){
        this.name = name;
        this.health = health;
        this.hammer = hammer;
        this.dragonicArmor = dragonicArmor;
    }

    public String getName() {
        return name;
    }

    public int getHammer() {
        return hammer;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int damage) {
        health = health - (damage - dragonicArmor);
    }



}

// Task 1: Write another class here for a different type of character (e.g. archer)

// Task 2: Write instance variables

// Task 3: Write the constructor

// Task 4: Write the necessary getter(accessor) and setter(modifier) methods.