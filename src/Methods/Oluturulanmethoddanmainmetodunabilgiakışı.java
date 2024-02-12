package Methods;

public class Oluturulanmethoddanmainmetodunabilgiakışı {
	public static void createCrew(String name1,String name2,String name3,String name4) {
		System.out.println("navigator:" + name1);
		System.out.println("pilot:" + name2);
		System.out.println("secondpilot:" + name3);
		System.out.println("flightengineer:" + name4);
	}
	public static void main(String[] args) {
		String navigator = "Jesus";
		String pilot = "Berkin";
		String secondpilot = "Henry";
		String flightengineer = "Jonas";
		createCrew(navigator, pilot, secondpilot, flightengineer);
	}

}
