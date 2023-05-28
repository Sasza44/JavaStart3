package second.level;

public class Third {

	public static void main(String[] args) {
		int number = 1322;
		int a = number / 1000;
		int b = (number - 1000 * a) / 100;
		int c = (number - 1000 * a - 100 * b) / 10;
		int d = number - 1000 * a - 100 * b - 10 * c;
		
		if (a + b == c + d) {
			System.out.println("The ticket is happy");
		}
		else {
			System.out.println("The ticket isn't happy");
		}
	}
}
