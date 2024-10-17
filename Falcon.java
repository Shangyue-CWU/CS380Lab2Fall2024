public class Falcon extends Animal {
      
      public Falcon(String name) {
         super(name);
      }
      /**
      * Prints the sound a falcon would make
      */
      @Override
      public void sound(){
         System.out.println("Tweet!");
      }
      
      /**
      * Prints a way for a falcon to play
      */
      @Override
      public void play(){
         System.out.println(this.name + " flys!");
      }
      
      /**
      * Prints a falcon eating
      */
      @Override
      public void eat(){
         System.out.println(this.name + " eats some food.");
      }
      
      public static void main(String args[]) {
         Falcon falcon1 = new Falcon("Tweetie");
         
         falcon1.sound();
         falcon1.play();
         falcon1.eat();
      }  
   }
