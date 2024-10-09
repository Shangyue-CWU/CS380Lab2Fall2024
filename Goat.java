public class Goat extends Animal{

    /*
     * @param name name of the goat
     * @since 10/9/2024
     * @description creates a goat object using a specified name
     */
    public Goat(String name){
        super(name);
    }

    @Override
    /*
     * @param none 
     * @return void
     * @description
     */
    public void play() {
        System.out.println(this.name + " plays in the grass");
    }


    /*
     * @param none
     * @return void
     * @description prints out the sound that a goat makes
     */
    public void sound(){
        System.out.println(this.name + " makes a baaaaaaah sound");
    }

    public static void main(String[] args) {
        Goat goat = new Goat("Goat");
        goat.play();
        goat.sound();
        goat.eat();
    }

}