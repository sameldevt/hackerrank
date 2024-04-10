package end_of_file;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int index = 1;
		while (scan.hasNext()) {
			System.out.println(index + " " + scan.nextLine());
			index++;
		}
	}

}
