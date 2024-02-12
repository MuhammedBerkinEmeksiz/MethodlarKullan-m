package Methods;

import java.util.Scanner;

public class Farklımethoddanbilgiaktarımı {
	public Farklımethoddanbilgiaktarımı(String Firstname, String Surname) {
		System.out.println(Firstname+Surname);
	}
	public static void Writenames(String Firstname,String Surname) {
		System.out.println(Firstname+Surname);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Farklımethoddanbilgiaktarımı person = new Farklımethoddanbilgiaktarımı(scan.next(),scan.next());
	}

}
