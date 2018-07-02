
public class Circle implements Shape{
	private double r;
	public Circle(double r) {
		this.r = r;
	}

	public double computeArea() {
		double Area = Shape.PI*r*r; 
		return Area;
	}
	public double computeCircumference() {
		double circum = Shape.PI*r*2;
		return circum;
	}	
}
