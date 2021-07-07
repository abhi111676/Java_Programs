import java.util.Scanner;

public class Check_VowelConstant {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Character : ");
			String c = sc.next();

			if (c.charAt(0) == 'a' || c.charAt(0) == 'e' || c.charAt(0) == 'i' || c.charAt(0) == 'o'
					|| c.charAt(0) == 'u')
				System.out.println(c + " is vowel");
			else
				System.out.println(c + " is consonant");
		}

	}
}
