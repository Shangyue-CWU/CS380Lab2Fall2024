// Purpose: This file is the driver file that creates a Tiger object and calls the play, sound, and eat methods.
public class Driver{
    /**
    * Main method that creates a Tiger object and calls the play, sound, and eat methods.
    * @param args
    */
    public static void main(String[] args){
    Animal tony = new Tiger("tony");
    tony.play();
    tony.sound();
    tony.eat();
    }
}

