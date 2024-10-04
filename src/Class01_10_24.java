public class Class01_10_24 {
    public static void main(String[] args) {
        Intro();
        System.out.println("And on that farm they had a cow.");
        chorus();
        System.out.println("With a moo moo here and a moo moo there");
        System.out.println("Here a moo, there a moo, everywhere a moo moo");
        Intro();
        verse("duck", "kvak");
        chorus();

        Intro();

    }

    public static void Intro(){
        System.out.println("Old MacDonald had a farm");
        chorus();
    }
    public static void chorus()
    {
        System.out.println("E-I-E-I-O");
    }
    public static void verse(String animal, String sound){
        System.out.println("And on that farm they had a " + animal);
        chorus();
        System.out.println("With a " + sound + " " + sound + " here and a " + sound + " " + sound + " there");
        System.out.println("Here a " + sound + ", there a " + sound + " everywhere a " + sound + " " + sound);
    }


}

