package Methods;

import java.util.Iterator;
import java.util.Scanner;

public class Methodlardaarrayminmaxkullanımı2 {
	public static int getMaxValue(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int value:array) {
			if(value>max) {
				max = value;
			}
		}
		return max;
	}
	public static int getMinValue(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int value:array) {
			if(value<min) {
				min = value;
			}
		}
		return min;
	}
	public static void printArray(int[] array) {
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("dizinin kac elemanli olmasini istiyorsunuz:");
		int n = scan.nextInt();
		System.out.println();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print(i+". eleman");
			array[i] = scan.nextInt();
		}
		printArray(array);
		System.out.println("max="+getMaxValue(array));
		System.out.println("min="+getMinValue(array));
	}

}
