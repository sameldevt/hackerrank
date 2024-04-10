package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
        ArrayList<List> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++){
            int d = scan.nextInt();
            List x = new ArrayList<>();
            for(int j = 0; j < d; j++){
            	int num = scan.nextInt();
                x.add(num);
            }
            arr.add(x);
        }
        
        int q = scan.nextInt();
        
        for(int i = 0; i<q; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            try{
                System.out.println(arr.get(x + 1).get(y + 1));
            }catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
                
            }
        }
	}
}
