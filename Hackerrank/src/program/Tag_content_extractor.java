package program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_content_extractor {

	public static void main(String[] args) {
		//String regex = "^<([^>]+)>.*</\\1>$";
		String regex = "<[^>]*>.*</\\1>$";
		Scanner in = new Scanner(System.in);
		// Cria um Pattern com a expressão regular
        Pattern pattern = Pattern.compile(regex);
        // Cria um Matcher com a string de entrada
        
        
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			System.out.print("line> ");
			String line = in.nextLine();
			
			Matcher matcher = pattern.matcher(line);
          	System.out.println(matcher.replaceAll(""));
			
			testCases--;
		}

	}

}
