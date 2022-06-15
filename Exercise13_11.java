package chapter_13;

public class Exercise13_11 {

	
	public static void main(String[] args)  {
		
		Octagon oct1 = new Octagon(15.0);
		
		Octagon oct2 = (Octagon) oct1.clone();
		//System.out.println(oct3.getSide());
		
		System.out.println(oct1.compareTo(oct2));
	}
}

