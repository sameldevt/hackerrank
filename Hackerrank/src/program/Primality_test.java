package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Primality_test {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bi = new BigInteger(n);
         
         if(bi.isProbablePrime(100)){
            System.out.println("prime"); 
         }
         else {
             System.out.println("not prime");
         }
        
        
        bufferedReader.close();
	}

}
