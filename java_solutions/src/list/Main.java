package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			l.add(x);
		}

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			String querie = scan.next();

			if (querie.equals("Insert")) {
				int x = scan.nextInt();
				int y = scan.nextInt();

				l.add(x, y);
			} else if (querie.equals("Delete")) {
				int x = scan.nextInt();

				l.remove(x);
			}
		}

		for (int x : l) {
			System.out.print(x + " ");
		}
	}

}
