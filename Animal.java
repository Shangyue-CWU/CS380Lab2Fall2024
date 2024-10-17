/**
 *Abstract class Animal. Any class that extends this class
 *will have to override all of the abstract methods.
 *@author Shangyue Zhu.
 */
public abstract class Animal{


   /**
    * A field which stores the animals name.
    */
   protected String name;


   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Animal(String name){
      this.name = name;
   }


   /**
    *Abstract method that should represent a specific sound
    * an animal makes.
    */
   public abstract void sound();


   /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
   public abstract void play();


   /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      System.out.println(this.name + " eat some plants.");
   }
}

/**
 * Iguana class that extends the Animal abstract class.
 * This class represents an iguana and its specific behaviors.
 * @author Ben Howell-Burke
 */
class Iguana extends Animal {

   /**
    * Constructor for Iguana class.
    * Calls the constructor of the Animal class.
    * @param name Name of the iguana.
    */
   public Iguana(String name) {
      super(name);  // Call the parent constructor to set the name
   }

   /**
    * Override the sound method to represent the iguana's sound.
    */
   @Override
   public void sound() {
      System.out.println(this.name + " makes a soft hissing sound.");
   }

   /**
    * Override the play method to represent how iguanas play.
    */
   @Override
   public void play() {
      System.out.println(this.name + " lay in the sun for fun.");
   }

   /**
    * Main method to test the Iguana class implementation.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      // Create an Iguana object and test its methods
      Iguana iggy = new Iguana("Iguanas");
      iggy.sound();  // Iggy makes a soft hissing sound.
      iggy.play();   // Iggy basks in the sun for fun.
      iggy.eat();    // Iggy eats some food.
   }
}

