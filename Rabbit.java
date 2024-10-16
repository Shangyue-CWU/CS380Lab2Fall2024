package CS380Lab2Fall2024;

public class Rabbit extends Animal{
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Rabbit(String name) {
        super(name);
        System.out.println(name + " is a rabbit.");
    }

    /**
     * Abstract method that should represent a specific sound
     * an animal makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " makes a muttering sound.");
    }

    /**
     * Abstract method that should represent a specific  activity
     * that an animal does for fun.
     */
    @Override
    public void play() {
        System.out.println(this.name + " frolics in the grass.");
    }
    /**
     * A  method that prints out that the animal is eating food.
     */
    @Override
    public void eat(){
        System.out.println(this.name + " eats some food.");
    }
}
