public class Tiger extends Animal {
   /**
   * Field that takes in the name of the tiger, whilist utilizing the super keyword.
   * @param name Name of the tiger.
   */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Method that prints out that the tiger is playing.
     * Overriden from the abstract method in the Animal class.
     */
    @Override
        public void play() {
            System.out.println(this.name + " plays with a giant yarn ball.");
        }
    /**
     * Method that prints out that the tiger is making a sound.
     * Overriden from the abstract method in the Animal class.
     */
    public void sound() {
        System.out.println(this.name + " roars.");
    }
    /**
     * Method that prints out that the tiger is eating.
     * Overriden from the abstract method in the Animal class.
     */
    public void eat() {
        System.out.println(this.name + " eats some meat.");
    }
}

