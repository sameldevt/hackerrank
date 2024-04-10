package if_else;

import java.util.Scanner;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		
		if(n % 2 != 0) {
			System.out.println("Weird");
			return;
		}
		
		if(n >= 2 && n <= 5) {
			for(int i = 2; i <= n; i++) {
				if(n % i == 0) {
					System.out.println("Not Weird");
					return;
				}
			}
		}
		
		if(n >= 6 && n <= 20) {
			for(int i = 6; i <= n; i++) {
				if(n % i == 0) {
					System.out.println("Weird");
					return;
				}
			}
		}
		
		if(n >= 20 && n % 2 == 0) {
			System.out.println("Not Weird");
			return;
		}
		
		scanner.close();
	}
}