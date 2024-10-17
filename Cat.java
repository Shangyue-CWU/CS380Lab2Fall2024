public class Cat extends Animal
	{
		/**
		*Constructor to create name
		*/
		public Cat(String name)
			{
				super(name);
			}

		/**
		*Override to create sound
		*/
		@Override
		public void sound()
			{
				System.out.println("Meow");
			}

		/**
		*Override for play activity
		*/
		public void play()
			{
				System.out.println("Play with laser pointer");
			}

		/**
		*Main class to create new Cat with name, sound, play, and eat
		*/
		public static void main(String[] args)
			{
				Cat cat = new Cat("Rory");
				cat.sound();
				cat.play();
				cat.eat();
			}
	}