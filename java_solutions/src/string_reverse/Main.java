package string_reverse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String T = "";
		for(int charac = A.length() - 1; charac >= 0; charac--) {
			T += A.charAt(charac);
		}
		
		System.out.println(A.equals(T) ? "Yes" : "No");
	}

}