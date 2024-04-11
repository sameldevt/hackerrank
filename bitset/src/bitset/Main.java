package bitset;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Map<Integer, BitSet> map = new HashMap<Integer, BitSet>();

	static void xor(BitSet b1, BitSet b2) {
		b1.xor(b2);

		System.out.println(map.get(1).cardinality() + " " + map.get(2).cardinality());
	}

	static void and(BitSet b1, BitSet b2) {
		b1.and(b2);

		System.out.println(map.get(1).cardinality() + " " + map.get(2).cardinality());
	}

	static void set(BitSet b, int pos) {
		b.set(pos);
		System.out.println(map.get(1).cardinality() + " " + map.get(2).cardinality());
	}

	static void flip(BitSet b, int pos) {
		b.flip(pos);
		System.out.println(map.get(1).cardinality() + " " + map.get(2).cardinality());
	}

	static void or(BitSet b1, BitSet b2) {
		b1.or(b2);

		System.out.println(map.get(1).cardinality() + " " + map.get(2).cardinality());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		map.put(1, b1);
		map.put(2, b2);

		int m = scan.nextInt();

		for (int i = 0; i < m; i++) {
			String operation = scan.next();

			if (operation.equals("AND")) {
				int bset1 = scan.nextInt();
				int bset2 = scan.nextInt();

				and(map.get(bset1), map.get(bset2));
			} else if (operation.equals("SET")) {
				int bset = scan.nextInt();
				int pos = scan.nextInt();
				set(map.get(bset), pos);

			} else if (operation.equals("FLIP")) {
				int bset = scan.nextInt();
				int pos = scan.nextInt();
				flip(map.get(bset), pos);

			} else if (operation.equals("OR")) {
				int bset1 = scan.nextInt();
				int bset2 = scan.nextInt();

				or(map.get(bset1), map.get(bset2));
			} else if (operation.equals("XOR")) {
				int bset1 = scan.nextInt();
				int bset2 = scan.nextInt();

				xor(map.get(bset1), map.get(bset2));
			}

		}
	}

}
