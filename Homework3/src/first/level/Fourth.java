package first.level;

public class Fourth {

	public static void main(String[] args) {
		int a = 47;
		int b = 80;
		int c = 34;
		
		if(a + b > c && b + c > a && a + c > b) {
			System.out.println("This triangle exists");
		}
		else {
			System.out.println("This triangle doesn't exist");
		}
	}
}
