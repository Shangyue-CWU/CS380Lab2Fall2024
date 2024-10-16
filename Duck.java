/**
 *Name: Cadne Binder
 *Date: 10/15/24
 *File: Duck.java
 */
 
public class Duck extends Animal {
   
   /**
    *Creates the Duck constructor to override the name method in the Animal file 
    */
   public Duck(String name) {
   
      super(name);
   
   }
   
   /**
    *Creates the sound method to override the sound method in the Animal file 
    */
   public void sound() {
   
      System.out.println("QUAAAAACK D00D!"); 
   
   }
   
   /**
    *Creates the play method to override the play method in the Animal file 
    */
   public void play() {
   
      System.out.println("Me like swimming on the lake!"); 
   
   }
   
   public static void main(String[] args) { 
   
      /**
      *Creates the variable donaldDuck of type Duck Object, assigning it the name Donald 
      */
      Duck donaldDuck = new Duck("Donald"); 

      /**
      *Implements the sound, play, and eat methods to display information about the duck 
      */
      donaldDuck.sound();
   
      donaldDuck.play();
   
      donaldDuck.eat();
   
   }
}