
public class Problem4 {
	
	public static int reverse(int n) {
		
		int i = 0;
		
		while(n != 0) {
			int r = n % 10;
			i = (i * 10) + r;
			n /= 10;
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		
		int max = 0;
		
		for(int i = 100; i < 1000; i++) {
			for(int k = 100; k < 1000; k++) {
				if(i * k == reverse(i * k) && i * k > max)
					max = i * k;
				
			}
		}
		
		System.out.println(max);
	}

}
