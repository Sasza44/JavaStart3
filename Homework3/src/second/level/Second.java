package second.level;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Write x ");
		x = sc.nextInt();
		int y;
		System.out.println("Write y ");
		y = sc.nextInt();
		
		if((x < 0 || x > 6) || y < (1 / 6) * x) { // введення рівняння прямої, яка є нижньою стороною трикутника
			System.out.println("This point is outside the triangle");
		}
		else {
			if((x <= 4 && y <= x) || (x > 4 && x <= 6 && y <= - (3 / 2) * x + 10)) { // введення на двох проміжках рівнянь верхніх сторін трикутника
				System.out.println("This point is inside the triangle");
			}
			else {
				System.out.println("This point is outside the triangle");
			}
		}
	}
}
