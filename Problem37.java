
public class Problem37 {
	
	public static void main(String[] args) {
		
		long sum = 0;
		for(int count = 0, i = 11; count < 11; i++) {
			if(truncright(i) && truncleft(i)) {
				sum += i;
				count++;
			}
		
		
		}
		
		System.out.println(sum);
	}
	
	public static boolean truncleft(long n) {
		for(long i = 10; i < n; i *= 10) {
			if(!isPrime(n % (long)i))
				return false;
		}
		
		return true;
	}
		
	
	
	public static boolean truncright(long n) {
		
		while(n > 0) {
			if(!isPrime(n))
				return false;
			n /= 10;
		}
		return true;
			
	}
    public static boolean isPrime(long arg) {
		
		if(arg > 2 && arg % 2 == 0)
			return false;
		
		if (arg == 1) {
			return false;
		}
		
		for(int i = 3;i <= Math.sqrt(arg); i++) {
			if(arg % i == 0)
				return false;
		}
			
			
	    return true;
	}

}
