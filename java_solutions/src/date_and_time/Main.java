package date_and_time;

import java.util.Calendar;
import java.util.Locale;

public class Main {
	public static String findDay(int month, int day, int year) {
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, day);
		c.set(Calendar.YEAR, year);

		return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
	}

	public static void main(String[] args) {
		System.out.println(findDay(8, 14, 2017));
	}

}
