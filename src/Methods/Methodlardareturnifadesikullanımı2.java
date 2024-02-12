package Methods;

public class Methodlardareturnifadesikullanımı2 {
	public static void signIn(String username) {
		if(username.equals("user")) {
			System.out.println("kullanici adiniz user olarak belirlendi");
			return;
		}
		System.out.println("welcome"+" "+username);
	}
	public static void main(String[] args) {
		signIn("mehmet");
	}

}
