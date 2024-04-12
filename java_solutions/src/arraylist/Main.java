package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<List<Integer>> l = new ArrayList<>();
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			List<Integer> line = new ArrayList<Integer>();
			int d = scan.nextInt();

			for (int j = 0; j < d; j++) {
				int d1 = scan.nextInt();
				line.add(d1);
			}

			l.add(line);
		}

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			try {
				System.out.println(l.get(x - 1).get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
	}

}
