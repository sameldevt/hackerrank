package subarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        
	        for(int i = 0; i < a.length; i++) {
	            a[i] = scan.nextInt();
	        }
	        
	       int negativeCount = 0;
	        int sum = 0;
	        for(int i = 0; i < a.length; i++) {
	            for (int j = i; j < a.length; j++) {
	                sum += a[j];
	                if(sum < 0) {
	                    negativeCount++;
	                }
	            }
	            sum = 0;
	        }
	        
	        System.out.println(negativeCount);
	    }

}
