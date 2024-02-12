package Methods;

public class Birmethoddanmainmethodunabilgiyazdırma {
	public static void printPersonInfo(String firstname,String surname,String favouritedishes){
		System.out.println("firstname:" + firstname);
		System.out.println("surname:" + surname);
		System.out.println("favouritedishes:" + favouritedishes);
	}
	public static void main(String[] args) {
		String firstname = "Berkin";
		String surname = "EMEKSİZ";
		String favouritedishes = "Lahmacun,Manti,Kebab,Ezogelin soup,Menemen";
		printPersonInfo(firstname, surname, favouritedishes);
	}

}
