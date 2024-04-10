package program;

import java.math.BigInteger;
import java.util.Scanner;

public class Biginteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		BigInteger abi = new BigInteger(a);
		BigInteger bbi = new BigInteger(b);
		
		System.out.println(abi.add(bbi));
		System.out.println(bbi.multiply(abi));

	}

}
