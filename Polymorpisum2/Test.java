package polymorpisum2;

public class Test {
	public static void main (String args []) {
		
		Shape s = new Shape();
		Rectangle r = new Rectangle(20,30);
		Triangle t = new Triangle(40,50);
		
		System.out.println(s.area());
		System.out.println(r.area());
		System.out.println(t.area());
		
		
	}

}
