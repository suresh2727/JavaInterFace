
public class Rectangle implements ShapeCalculator{
	int l;
	int w;
	public Rectangle(int l, int w) {
		this.l = l;
		this.w = w;
	}
	
	public double area() {
		double area = this.l * this.w;
		return area;
	}
	
	public double perimeter() {
		double peri = 2*(this.l + this.w);
		return peri;
	}
	
}
