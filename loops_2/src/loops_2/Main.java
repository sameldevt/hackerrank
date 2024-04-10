package loops_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int q =in.nextInt();
	        int number = 0;
	        
	        for(int i=0;i<q;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	            number = a;
	            
	            for(int j=1, k=1; k<=n; j*=2, k++) {
	            	number += j * b;
	            	System.out.print(number + " ");
	            }
	            System.out.println();
	        }
	                
	        in.close();
	}

}
