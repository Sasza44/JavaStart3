package first.level;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int largestNumber;
		System.out.println("Write first number ");
		a = sc.nextInt();
		System.out.println("Write second number ");
		b = sc.nextInt();
		System.out.println("Write third number ");
		c = sc.nextInt();
		System.out.println("Write fourth number ");
		d = sc.nextInt();
		
		largestNumber = a;
		if(b >= largestNumber) {
			largestNumber = b;
		}
		if(c >= largestNumber) {
			largestNumber = c;
		}
		if(d >= largestNumber) {
			largestNumber = d;
		}
		
		System.out.println("largestNumber = " + largestNumber);
	}
}
