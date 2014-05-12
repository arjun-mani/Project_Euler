import java.util.ArrayList;

public class Problem41 {
	
	public static void main(String[] args) {
		ArrayList <Integer> Pandigitals = new ArrayList <Integer> ();
		for(int i = 2; i <= 10000000; i++) {
			if(isPandigital(i))
				Pandigitals.add(i);
		}
		
		for(int n : Pandigitals) {
			if(isPrime(n))
				System.out.println(n);
		}
	}
	
	public static boolean isPandigital(int n) {
		int x = countdigit(n);
		String s = Integer.toString(n);
		
		for(int i = 1; i <= x; i++) {
			String a = Integer.toString(i);
			if(! s.contains(a)) {
				return false;
			}
			
		}
		
		return true;
	
	}
	
	public static int countdigit(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n /= 10;
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
