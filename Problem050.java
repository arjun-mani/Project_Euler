import java.util.ArrayList;

public class Problem50 {
	
	public static void main(String[] args) {
		int limit = 1000000;
		ArrayList <Integer> primes = new ArrayList <Integer> ();
		for(int i = 2; i <= limit; i++) {
			if(isPrime(i))
				primes.add(i);
			
		}
		int maxsum = 0;
		int maxrun = -1;
		for(int i = 0; i < primes.size(); i++) {
			int sum = 0;
			for(int j = i; j < primes.size(); j++) {
				sum += primes.get(j);
				
				if(sum > limit)
					break;
				else if(j - i > maxrun && sum > maxsum && isPrime(sum)) {
					maxrun = j - i;
					maxsum = sum;
				}
			}
		}
		
		System.out.println(maxsum);
		
	}
	
	
    public static boolean isPrime(int n) {
		
    	if(n == 1)
    		return false;
		
		if(n > 2 && n % 2 == 0)
			return false;
		
		for(int i = 3;i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
			
			
	    return true;
	}
	
	

}
