package Methods;

public class Methodlardadizininaynıyeriişaretetmesi {
public static void printArray(int[] data) {
	int sum = 0;
	for (int i = 0; i < data.length; i++) {
		sum = sum + data[i];
		System.out.println(sum);
	}
}
	public static void main(String[] args) {
		int[] months = {31,28,31,30,31,30};
		printArray(months);
	}

}
