package chapter_13;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side = 15.0; 
	
	
	
	
	
	
	@Override
	public double getArea() {
		double Area = ((2 + (4/Math.sqrt(2)))* side * side);
				return Area;
	}

	@Override
	public double getPerimeter() {
		double Perimeter = side * 8 ;
		return Perimeter;
	}

	

	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
