public class BobCat extends Animal {
   
   //constructor 
   public BobCat(String name) {
      //call the parent constructor to set name 
      super(name);
   }
   
   //overridde sound method
   public void sound() {
      System.out.println("The bobcat makes a rawr sound.");
   }
   
   //override play method 
   public void play() {
      System.out.println("The bobcat likes to climb trees.");
   }
   
   //override eat method 
   public void eat(){
      System.out.println("The bobcat likes to eat squirrels and other small animals.");

   }

}