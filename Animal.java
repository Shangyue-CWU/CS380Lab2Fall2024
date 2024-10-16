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
      System.out.println(this.name + " eats some food.");
   }
}
/**
 * A Class that extends the Animal class in order to execute 
 * abstract methods by over-riding them with public methods. 
 * @author Kyle Dennewith
 *
 */
class Goldfish extends Animal{
	
	/**
	 * Constructor method for Goldfish objects
	 * @param name The name of the Goldfish.
	 */
	public Goldfish(String name) {
		super(name);
	}
	
	/**
	 * Main method to run the program.
	 * @param args An array of String arguments
	 */
	public static void main(String[] args) {
		
		   Animal goldy = new Goldfish("Goldy");
		   goldy.eat();
		   goldy.play();
		   goldy.sound();
	   
	}
	
	/**
	 * A method that over-rides the Animal method 'sound' to output a string of text
	 * that sounds like a Goldfish.
	 */
	
	public void sound() {
	
		System.out.println(this.name + " goes \"pawp\"");
		
	}
	
	/**
	 * A method that over-rides the Animal method 'play' to output a string of text
	 * that describes an action taken by the Goldfish.
	 */
	public void play() {
		
		System.out.println(this.name + " does a flip out of the water and back in.");
	}
	
}//End of Goldfish Class
