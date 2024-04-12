package substring_comparison;

public class Main {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		
		for (int i = 1; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}

}
