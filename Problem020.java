
public class Problem20 {
	
	public static void main(String[] args) {
		
		String temp = factorial(100).toString();
		int sum = 0;
		
		for(int i = 0; i < temp.length(); i++) {
			sum += temp.charAt(i) - '0';
		}
		
		
	      System.out.println(sum);
	}
	
	public static long factorial(long n) {
		long base = 1;
		
		for(int i = 1; i <= n; i++) {
			base *= i;
		}
		
		return base;
	}

}
