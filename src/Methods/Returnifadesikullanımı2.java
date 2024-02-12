package Methods;

import java.util.Scanner;

public class Returnifadesikullanımı2 {
	public static long cube(long a) {
		return a*a*a;
	}
	
	public static long ninthDegree(long a) {
		return cube(cube(a));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		System.out.println(cube(a));
		System.out.println(ninthDegree(a));
	}

}
