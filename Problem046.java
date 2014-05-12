
public class Problem46 {
	
	public static void main(String[] args) {
		
		for(int i = 2; ;i++)
			if(!isGold(i))
				System.out.println(i);
	}
	
	
	public static boolean isGold(int n) {
		
		if(n % 2 == 0 | isPrime(n))
			return true;
		
		for(int i = 0; i * i <= n/2; i++) {
			if(isPrime(n - 2 * i * i))
				return true;
		}
		
		return false;
	}
	
	
	
    public static boolean isPrime(int arg) {
		
		if(arg > 2 && arg % 2 == 0)
			return false;
		
		for(int i = 3;i <= Math.sqrt(arg); i++) {
			if(arg % i == 0)
				return false;
		}
			
			
	    return true;
	}
    
}
