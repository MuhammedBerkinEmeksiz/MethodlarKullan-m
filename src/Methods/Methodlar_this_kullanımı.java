package Methods;

public class Methodlar_this_kullanımı {
	public static String name = "Amigo";
    public static String position = "Java developer";
    public static int salary = 10_000;
    public void setPosition(String position) {
        Methodlar_this_kullanımı.position = position;// Methodlar_this_kullanımı.position yerine this.position da yazılabilir, eğer staticse position Methodlar_this_kullanımı. eğer static değilse this.
        System.out.println(position);
    }
    public void setSalary(int salary) {
        Methodlar_this_kullanımı.salary = salary;// Methodlar_this_kullanımı.salary yerine this.salary da yazılabilir, eğer staticse salary Methodlar_this_kullanımı. eğer static değilse this.
        System.out.println(salary);
    }
	public static void main(String[] args) {
		Methodlar_this_kullanımı insan = new Methodlar_this_kullanımı();
		insan.setPosition(name);
		insan.setSalary(salary);
	}

}
