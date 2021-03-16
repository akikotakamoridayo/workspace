package code15_04_02;

public class Main {

	public static void main(String[] args) {
		System.out.println("Jaaaaava".matches("Ja*va"));
		System.out.println("Moon".matches("Ma.*"));
		System.out.println("jeans".matches("^j.*p$"));
	}

}
