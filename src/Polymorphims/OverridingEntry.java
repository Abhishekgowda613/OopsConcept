package Polymorphims;

import Polymorphims.Overriding.Cat;
import Polymorphims.Overriding.Cat.Dog;

public class OverridingEntry {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		Dog d = new Dog();
		d.sound();
		

	}

}
