package Polymorphims;

public class Overriding{
	
	public void sound(){
		 System.out.println("Makes sound");
	 }  
	public static class Cat extends OverridingEntry{
		public void sound() {
			System.out.println("mew mew");
		}
		
		public static class Dog extends OverridingEntry{
			public void sound() {
				System.out.println("Bow Bow");
			}
		}
	}
	
		}  

