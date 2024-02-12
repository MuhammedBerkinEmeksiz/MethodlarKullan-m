package Methods;

import java.util.Scanner;

public class Methodlardafinalsözcüğününkullanımı_Çemberoluşturma {
	public static final double pi = 3.14;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius value:");
		double radius = scan.nextDouble();
		System.out.print("Enter the diameter value:");
	    double diameter = scan.nextDouble();
		 System.out.println("The area of the circle is: " + pi * radius * radius);
	     System.out.println("The perimeter of the circle is: " + pi * diameter);
	}

}
