
public class Problem30 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 2; i < 295250; i++) {
			if(fifthsum(i) == i)
				sum += i;
		}
		
		System.out.println(sum);
		
	}
	
	public static int fifthsum(int n) {
		
		int sum = 0;
		
		while(n != 0) {
			int k = n % 10;
			sum += (int) Math.pow(k, 5);
			n /= 10;
		}
		
		return sum;
	}
	
	
	
}
