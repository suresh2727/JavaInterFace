
public class Square implements ShapeCalculator {
	int l;
	Square(int l){
		this.l = l;
		
	}
	
	public double area() {
		double area = this.l*this.l ;
		return area;
		
	}
	
	public double perimeter() {
		double peri = 4 * this.l;
		return peri;
		
	}
}
