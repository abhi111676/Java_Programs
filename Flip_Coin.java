import java.util.Scanner;

public class Flip_Coin {

	public static void main(String[] args) {
		int hcount = 0;
		int tcount = 0;
		int chance = 0;
		int percentage = 0;
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter how many time to flip the coin :-");
			int count = obj.nextInt();
			for (chance = 1; chance <= count; chance++) {
				if (Math.random() < 0.5) {
					tcount++;
					percentage = (tcount * 100) / count;
					System.out.println("Tails" + tcount);
				} else {
					hcount++;
					percentage = (hcount * 100) / count;
					System.out.println("Heads" + hcount);
					// count++;
				}
			}
		}
		if (tcount > hcount) {
			System.out.println("Tails won by" + " " + percentage + "%");
		} else {
			System.out.println("Heads won by" + " " + percentage + "%");
		}
	}
}
