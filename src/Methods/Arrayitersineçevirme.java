package Methods;

public class Arrayitersineçevirme {
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static void reverseArray(int[] array) {
		for (int i = 0; i < array.length/2; i++) {
			int temporary  = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temporary;
		}
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		printArray(array);
		reverseArray(array);
		printArray(array);
	}
}
