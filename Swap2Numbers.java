import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Num: ");
			int first = sc.nextInt();

			System.out.println("Enter Second Num: ");
			int second = sc.nextInt();

			System.out.println("Before swap");
			System.out.println("First number = " + first);
			System.out.println("Second number = " + second);

			int temporary = first;
			first = second;
			second = temporary;

			System.out.println("After swap");
			System.out.println("First number = " + first);
			System.out.println("Second number = " + second);
		}
	}
}
