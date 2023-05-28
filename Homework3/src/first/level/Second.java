package first.level;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apartmentNumber;
		System.out.println("Write number of apartment ");
		apartmentNumber = sc.nextInt();
		
		int a = 50;
		int b;
		int c;
		int f;
		
		if(apartmentNumber >= 1 && apartmentNumber <= 36) {
			System.out.println("Entrance 1");
			a = apartmentNumber;
		}
		else if(apartmentNumber >= 37 && apartmentNumber <= 72) {
			System.out.println("Entrance 2");
			a = apartmentNumber - 36;
		}
		else if(apartmentNumber >= 73 && apartmentNumber <= 108) {
			System.out.println("Entrance 3");
			a = apartmentNumber - 72;
		}
		else if(apartmentNumber >= 109 && apartmentNumber <= 144) {
			System.out.println("Entrance 4");
			a = apartmentNumber - 108;
		}
		else {
			System.out.println("This apartment does not exist");
		}
		
		if(a != 50) {
			b = a / 4;
			c = a % 4;
			if(c == 0) {
				f = b;
			}
			else {
				f = b + 1;
			}
			System.out.println("This apartment is on the " + f + " floor");
		}
	}
}
