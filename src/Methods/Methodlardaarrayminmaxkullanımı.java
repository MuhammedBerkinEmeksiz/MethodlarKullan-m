package Methods;

public class Methodlardaarrayminmaxkullanımı {
	public static int getMaxValue(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int value : array) {
			if(value > max) {
				max=value;
			}
		}
		return max;
	}
	public static int getMinValue(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int value : array) {
			if(value < min) {
				min=value;
			}
		}
		return min;
	}
	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = {123,7,-14,67,16,98,75,576};
		System.out.println("in the array:");
		printArray(array);
		System.out.println("minimum:"+getMinValue(array));
		System.out.println("minimum:"+getMaxValue(array));
	}

}
