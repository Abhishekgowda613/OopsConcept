package Inheritance;

public class InheritanceEntry {

	public static void main(String[] args) {
	
		Parent p = new Parent();
		p.pcolor = "Black";
		Child c = new Child();
		c.cWeight = 20;
		c.pcolor = "Black";
		System.out.println(c.pcolor);
		System.out.println(c.cWeight);

	}

}
