package program;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		int[] acount = new int[128];
		int[] bcount = new int[128];

		for (int i = 0; i < a.length(); i++) {
			int c1 = a.toLowerCase().charAt(i);
			int c2 = b.toLowerCase().charAt(i);
			acount[c1]++;
			bcount[c2]++;
		}

		for (int i = 0; i < acount.length; i++) {
			if (acount[i] != bcount[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("penis", "sined"));
	}

}
