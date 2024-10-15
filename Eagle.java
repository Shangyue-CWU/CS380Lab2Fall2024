/**
 *Animal class Eagle
 *This class must override abstract methods from the Animal class including:
 * name
 * sound
 * play
 *
 *@author Alex Boyce
 *@since 10/14/2024
 */

public class Eagle extends Animal {

    /**
     * Constructor for the Eagle class that takes in a name
     *
     * @param name Name of the eagle
     */
    public Eagle(String name)
    {
        super(name);
    }

    /**
     * Method that prints out the sound an eagle makes
     */
    public void sound()
    {
        System.out.println(this.name + " screeches.");
    }

    /**
     * Method that prints out the activity an eagle does for fun
     */
    public void play()
    {
        System.out.println(this.name + " dives for fish.");
    }

    public static void main(String[] args)
    {
        Eagle eagle = new Eagle("Hairy-Eagle");

        eagle.sound();
        eagle.play();
        eagle.eat();
    }
}