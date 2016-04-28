import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Automobile auto1 = new Automobile("Cabbie", "yellow", 4, 4, 4);
		Automobile auto2 = new Automobile("Sporty", "red", 2, 6, 6);
		Automobile auto3 = new Automobile("Vany", "green", 5, 6, 4);

		auto1.About();
		String about1 = auto1.About();
		System.out.printf("%s\n\n", about1);
		
		auto2.About();
		String about2 = auto2.About();
		System.out.printf("%s\n\n", about2);
		
		String about3 = auto3.About();
		System.out.printf("%s", about3);

	}

}