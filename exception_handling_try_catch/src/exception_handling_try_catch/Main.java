package exception_handling_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
			int y = scan.nextInt();

			System.out.println(x / y);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}

	}
}
