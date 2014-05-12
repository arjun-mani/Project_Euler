
public class Problem47 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		boolean found = false;
		
		

		while(! found) {
			if(primefactor(n) == 4 && primefactor(n + 1) == 4 && primefactor(n + 2) == 4 && primefactor(n + 3) == 4) {
				found = true;
				System.out.println(n);
				
			}
			
			else {
				n++;
			}
		}
		
		
	}
	
	public static int primefactor(int n) {
		int count = 0;
		int prev = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0 && isPrime(i)) {
				n = n / i;
				if(i != prev) {
					count ++;
				}
				
				i--;
				prev = i + 1;
				
			}
			
			if(n == 1)
				break;
		}
		
		return count;
	}
		
		
	
    public static boolean isPrime(int arg) {
		
		if(arg == 1)
			return false;
		
		if(arg > 2 && arg % 2 == 0)
			return false;
		
		for(int i = 3;i <= Math.sqrt(arg); i++) {
			if(arg % i == 0)
				return false;
		}
			
			
	    return true;
	}

}
