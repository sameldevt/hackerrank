package program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_username_checker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");
		System.out.println(matcher.matches());
	}
}
