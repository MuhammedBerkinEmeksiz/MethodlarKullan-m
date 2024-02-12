package Methods;

public class Matrisoluşturmaişleminifarklıbirmethoddançağırarakyapma {
	public static void main(String[] args) {
		wifi();
	}
	public static void wifi() {
		int[][] array = new int[10][10];
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				array[i - 1][j - 1] = i*j;
				System.out.print(array[i - 1][j - 1] = i*j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
