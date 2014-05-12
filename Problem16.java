import java.math.BigInteger;



public class Problem16 {
	
	public static void main(String[] args) {
		
	   
	  
		
		
	}
	
	public static long sumNum(long n) {
		
		long sum = 0;
		
		while(n != 0) {
			
			long i = n % 10;
			
			sum += i;
			n /= 10;
			
		}
		
		return sum;
	}

}
