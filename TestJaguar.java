/**
 * This class tests the functionality of the Jaguar class
 * by creating a Jaguar object and calling its methods.
 * The methods being tested include sound, play, and the inherited eat method.
 * 
 * @author Awjahney Markholt
 */
public class TestJaguar {

    /**
     * The main method is the entry point for testing the Jaguar class.
     * It creates an instance of Jaguar and calls its methods to verify their functionality.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Jaguar object with the name "Jaguar"
        Jaguar jaguar1 = new Jaguar("Jaguar");

        // Test the sound method
        jaguar1.sound();

        // Test the play method
        jaguar1.play();

        // Test the inherited eat method
        jaguar1.eat();
    }
}