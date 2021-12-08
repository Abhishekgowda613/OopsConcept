package Polymorphims;

public class  OverloadingEntry {
	public int add (int a, int b) {
		return a+b;
	
	}
	public int add (int a, int b, int c) {
		return a+b+c;
		
	}


	public static void main(String[] args) {
		OverloadingEntry add1 = new OverloadingEntry();
		
		System.out.println(add1.add(25, 20));
		System.out.println(add1.add(10, 20, 30));

	}

}