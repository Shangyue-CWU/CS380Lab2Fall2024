/**
 * This class represents a Jaguar, which extends the Animal class.
 * The Jaguar class overrides the sound, play, and eat methods to simulate
 * behaviors specific to a jaguar.
 * @author Awjahney Markholt
 */
public class Jaguar extends Animal {

    /**
     * Constructor that takes in the jaguar's name and passes it to the parent class.
     * @param name Name of the jaguar.
     */
    public Jaguar(String name) {
        super(name);
    }

    /**
     * This method overrides the sound method to simulate
     * the jaguar's roar.
     */
    @Override
    public void sound() {
        System.out.println("The " + name + " roars loudly!");
    }

    /**
     * This method overrides the play method to simulate
     * the jaguar's playful behavior of hunting for fish near water.
     */
    @Override
    public void play() {
        System.out.println("The " + name + " loves to play near the water, hunting for fish in the streams.");
    }

    /**
     * This method overrides the eat method to describe
     * the jaguar's diet of a wide variety of prey.
     */
    @Override
    public void eat() {
        System.out.println("The " + name + " enjoys eating a variety of prey that includes more than 85 species range-wide.");
    }
}