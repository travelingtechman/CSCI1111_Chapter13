package chapter_13;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	double side = 1;

	
	public Octagon() {
	}
	public Octagon(double side) {
		
		this.side = side;
		
	}
	
	public void setSide(double num) {
	    this.side = num;
	  }
	public double getSide() {
		return side;
	}
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
		
		if(side  > o.side) {
				return 1;
		}
		else if(side  < o.side) {
			return -1;
		}
		else return 0;
	}
	@Override
    public Object clone() {
       try {
    	   return super.clone();
       } 
       catch(CloneNotSupportedException e) {
        	   return null;
       }
//       finally {
//    	   return null;
//       }
	}
}
