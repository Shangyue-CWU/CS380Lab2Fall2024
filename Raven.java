public class Raven extends Animal{
    public static void main(String[] args)
    {
      Raven raven = new Raven("Bob");
      
      raven.sound();
      raven.play();
      raven.eat();
    }
    
    /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Raven(String name){
      super(name);
   }


   /**
    *Method that prints the sound a raven makes
    */
    @Override
   public void sound()
   {
      System.out.println(this.name + " goes: caw caw");
   }


   /**
    * Method that prints what a raven may do for fun
    */
    @Override
   public void play()
   {
      System.out.println(this.name + " does some acrobatic maneuvers");
   }



}