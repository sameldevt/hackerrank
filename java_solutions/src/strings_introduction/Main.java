package strings_introduction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		int sum = A.length() + B.length();
		
		String isLex = A.compareTo(B) > 0 ? "Yes" : "No";
		
		String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String newB = B.substring(0, 1).toUpperCase() + B.substring(1);
		
		System.out.println(sum);
		System.out.println(isLex);
		System.out.println(newA + " " + newB);

	}

}
