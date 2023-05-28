package second.level;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Write six-digit number ");
		number = sc.nextInt();
		int a1 = number / 100000;
		int a2 = (number - 100000 * a1) / 10000;
		int a3 = (number - 100000 * a1 - 10000 * a2) / 1000;
		int a4 = (number - 100000 * a1 - 10000 * a2 - 1000 * a3) / 100;
		int a5 = (number - 100000 * a1 - 10000 * a2 - 1000 * a3 - 100 * a4) / 10;
		int a6 = (number - 100000 * a1 - 10000 * a2 - 1000 * a3 - 100 * a4 - 10 * a5);
		
		if(a1 == a6 && a2 == a5 && a3 == a4) {
			System.out.println("the number is right ");
		}
		else {
			System.out.println("the number is wrong ");
		}
	}
}
