package chapter_13;
/**
 * 
 * @author ethan hunt
 * date 6/8/2022
 */


public class Triangle extends GeometricObject implements Colorable{
	private double side1 = 0.0;
	private double side2 = 0.0;
	private double side3 = 0.0;
	private double Area = 0.0;
	private double perimeter = 0.0;
	
		
		
		
		//System.out.println("Please enter a 0 if not filled, and a 1 if filled");	
		//	int fill = input.nextInt();
		//	if(fill == 0) {
				//Triangle.
			//}
	public Triangle() {	
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean fill) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(fill);
		
	} 
	public void setSide1(double num) {
		    this.side1 = num;
		  }
	public void setSide2(double num) {
	    this.side2 = num;
	  }
	public void setSide3(double num) {
	    this.side3 = num;
	  }
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		// TODO Auto-generated method stub
		return Area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (side1 + side2 + side3);
		return perimeter;
	}
	
	public String getString(){
		//double perimeter = 0;
		//double area = 0;
		//String color = "";
		//String string = toString();
		return ("the perimeter of the triangle is "+ getPerimeter() + ". The area is "+ getArea() +
				"\nand was " + toString());
	}

	@Override
	public void howToColor() {
		System.out.println("color all threee sides");
		
	}
}
