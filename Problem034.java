
public class Problem34 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 3; i < 10000000; i++) {
			if(i == sumfactorial(i))
				sum += i;
		  }
		
		System.out.println(sum);
		}
	
	private static int[] factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	
	
	public static int sumfactorial(int n) {
		
		int sum = 0;
		
		while(n != 0) {
			int k = n % 10;
			sum += factorial[k];
			n /= 10;
		}
		
		return sum;
	}
	

}
