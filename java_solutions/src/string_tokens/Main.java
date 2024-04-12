package string_tokens;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (s.isBlank()) {
			System.out.println(0);
			scan.close();
			return;
		}

		String regex = "[ !,?._'@]+";

		String[] tokens = s.strip().split(regex);

		System.out.println(tokens.length);
		if (tokens.length != 0) {
			for (String s2 : tokens) {
				System.out.println(s2);
			}
		}

		scan.close();
	}

}