

public class Problem53 {
	
	public static void main(String[] args) {
		int count = 0;
		for(long n = 1; n <= 100; n++) {
			for(long r = 1; r <= n; r++) {
				if(binomial(n, r) - 1000000 > 0)
					count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static long binomial(long n, long r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}
	
	public static long factorial (long n) {
	    long product = 1;
	    
	    if(n == 0)
	    	return 1;
	    
	    if(n == 1)
	    	return 1;
	    
	    else {
	    	for(long i = 2; i <= n; i++) {
	    		product *= i;
	    	}
	    }
	    
	    return product;
	
	}
	
}

