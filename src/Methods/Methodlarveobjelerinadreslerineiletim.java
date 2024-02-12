package Methods;

import java.util.Arrays;

public class Methodlarveobjelerinadreslerineiletim {
	public static void fillArray(int[] array, int begin,int value,int end){
		for (int i = begin; i < end; i++) {
			array[i] = value;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[5];
		fillArray(array, 0, 2, 5);
		System.out.println(Arrays.toString(array));
	}

}
