import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {

		System.out.println("Enter n: ");
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			if (n % 2 == 0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}
}
