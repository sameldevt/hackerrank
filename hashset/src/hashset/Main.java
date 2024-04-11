package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<List<String>> set = new HashSet<>();
		int uniqueSets = 0;
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			
			List<String> newSet = new ArrayList<String>();
			newSet.add(s1);
			newSet.add(s2);
			if(set.add(newSet)) {
				uniqueSets++;
			}
			System.out.println(uniqueSets);
		}
	}

}
