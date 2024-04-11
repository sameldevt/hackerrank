package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		Pattern p1 = Pattern.compile("[a-z]{2}");
		Pattern p2 = Pattern.compile("^[1-9]\\d{7}");

		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			String phone = in.nextLine();

			Matcher m = p1.matcher(name);
			Matcher m2 = p2.matcher(phone);

			if (m.find() && m2.find()) {
				phoneBook.put(name, Integer.valueOf(phone));
			}
		}
		do {
			String s = in.nextLine();

			Matcher m = p1.matcher(s);

			if (m.find()) {
				Integer contactNumber = phoneBook.get(s);
				if (contactNumber == null) {
					System.out.println("Not found");
					continue;
				}

				System.out.println(s + "=" + contactNumber);

			}
		} while (in.hasNext());
	}

}
