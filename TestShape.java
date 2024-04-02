
public class TestShape {
	public static void main(String[] args) {
		ShapeCalculator s1 = new Square(4);
		System.out.println("Area of the square" + s1.area());
		System.out.println("Perimeter of the sq " + s1.perimeter());
		
		ShapeCalculator s2 = new Rectangle(4 , 6);
		System.out.println("Rectangle area" + s2.area());
		System.out.println("Rectangle perimeter" + s2.perimeter());
	}
}
