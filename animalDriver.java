package CS380Lab2Fall2024;

public class animalDriver {
    /**
     * Main method
     */
    public static void main(String[] args) {
        //create a Rabbit object
        Rabbit fella = new Rabbit("Jim");
        //call the following 3 Rabbit methods
        fella.eat();
        fella.play();
        fella.sound();
    }
}
