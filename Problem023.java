
public class Problem23 {
	
	public static void main(String[] args) {
		int limit = 28123;
		int sum = 0;
		for(int i = 1; i <= limit; i++) {
			if(! canbeWrittenasAbundants(i))
				sum += i;
		}
		
		System.out.println(sum);
	}
	
	public static boolean canbeWrittenasAbundants(int n) {
		for(int i = 0; i <= n; i++) {
			if(isAbundant(i) && isAbundant(n - i)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isAbundant(int n) {
		if(sumdivisors(n) > n) {
			return true;
		}
		
		return false;
	}
	
	public static int sumdivisors(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				sum+= i;
		}
		
		return sum;
	}
	
	

}
