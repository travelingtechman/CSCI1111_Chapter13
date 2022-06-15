package chapter_13;

import java.util.Scanner;

public class Exercise13_7 {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		Triangle[] array = new Triangle[5];
		
		array[0] = new Triangle(21,15,11,"blue", true);
		array[1] = new Triangle(36,27,15,"red",true);
		array[2] = new Triangle(4,3,2,"purple",false);
		array[3] = new Triangle(5,9,6,"orange", false);
		array[4] = new Triangle(11,12,13,"lavender",true);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Triangle"+ i + "\t" +array[i].getString());
			array[i].howToColor();
			System.out.println("");
		}
		//System.out.print(triangle1.getString());
		
//		System.out.println("side1 of a triangle: ");
//	    	triangle1.setSide1(input.nextDouble());
//	    System.out.println("side2 of a triangle: ");
//	    	triangle1.setSide2(input.nextDouble());    
//	    System.out.println("side3 of a triangle: ");
//	    	triangle1.setSide3(input.nextDouble()); 
//	    	
//		System.out.println("Please enter a color");
//			String color = input.next();
//			triangle1.setColor(color);
//			
//		System.out.println("Is the triangle filled? input a 0 for not filled, and a 1 for is filled");
//			int fillInt = input.nextInt();
//		if(fillInt == 0) {
//			boolean fill = false;
//			triangle1.setFilled(fill);
//		} else if(fillInt == 1) {
//			boolean fill = true;
//			triangle1.setFilled(fill);
//		}
//		System.out.println(triangle1.getString());
		
	}

}
