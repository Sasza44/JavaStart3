package first.level;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Write year ");
		year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("This year is leap - 366 days");
		}
		else {
			System.out.println("This year is ordinary - 365 days");
		}
	}
}