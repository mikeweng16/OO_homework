
public class Rectangle implements Shape {
	private double sr;
	private double lr;
	public Rectangle(double sr, double lr) {
		this.sr = sr;
		this.lr = lr;
	}

	public double computeArea() {
		double Area = sr*lr; 
		return Area;
	}
	public double computeCircumference() {
		double circum = (sr+lr)*2;
		return circum;

	}
}
