package Methods;

public class Methodlardaikifarklıdeğerinaynıarraydeğerindegösterilmesi {
	public static void fill(int[][] data,int deger) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = deger;
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] months = {{31},{31,28},{31,30,31},{31,28,15,44},{31,30,30,31,99}};
		fill(months, 5);
		System.out.println(months[4][3]);
	}

}
