package second.level;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Write x ");
		x = sc.nextInt();
		int y;
		System.out.println("Write y ");
		y = sc.nextInt();
		double r = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
		
		if(r < 4) {
			System.out.println("this point is inside the circle");
		}
		else {
			System.out.println("this point is outside the circle");
		}
	}
}
