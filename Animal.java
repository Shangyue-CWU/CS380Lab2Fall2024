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
   
   public void main(String[]args) {
	   Animal goldy = new Goldfish("Goldy");
	   goldy.eat();
	   
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

class Goldfish extends Animal{
	public Goldfish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void sound() {
	
		System.out.println(name + " goes \"pawp\"");
		
	}
	
	public void play() {
		
		System.out.println(name + " does a flip out of the water and back in.");
	}
}
