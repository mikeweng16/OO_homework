
public class Test {

	public static void main(String[] args) {
		Shape cir = new Circle(10);
		Shape rec = new Rectangle(5,10);
		System.out.println("Circle Area: " + cir.computeArea() + 
				           ", Circle length: " + cir.computeCircumference());
		System.out.println("Rectangle Area: " + rec.computeArea() + 
		           ", Rectangle length: " + rec.computeCircumference());

	}

}
