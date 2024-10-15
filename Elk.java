import java.util.Random;

public class Elk extends Animal{
    /**
     * A field which stores the animals gender (and whether it has antlers).
     */
    boolean isMale;

    /**
     * A constructor that takes in a name.
     * randomly generates this Elk's gender.
     *@param name Name of the animal.
     */
    public Elk(String name) {
        super(name);
        Random rand = new Random();
        isMale = rand.nextBoolean();
    }

    /**
     * Override method where elk makes a sound.
     */
    @Override
    public void sound() {
        System.out.println("\"Eeeeeeek!\"");
    }

    /**
     * Override method which prints text depicting what this elk is doing.
     */
    @Override
    public void play() {
        if(isMale)
            System.out.println(name + " scratched his antler's on a tree.");
        else
            System.out.println(name + " grazed in a field.");
    }
}
