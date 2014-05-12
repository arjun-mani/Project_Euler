
public class Problem145 {
	
	public static void main(String[] args) {
		int count = 0;
		int limit = 1000000000;
		for(int i = 11; i < limit; i++) {
			if(isReversible(i))
				count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean isReversible(int n) {
		int r = n + reverse(n);
		if(n % 10 == 0)
			return false;
		if(allOdd(r)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean allOdd(int n) {
		while(n != 0) {
			int r = n % 10;
			if(r % 2 == 0) {
				return false;
			}
			
			 n /= 10;
		}
		
		return true;
	}
	
    public static int reverse(int n) {
		
		int i = 0;
		
		while(n != 0) {
			int r = n % 10;
			i = (i * 10) + r;
			n /= 10;
		}
		
		return i;
	}

}
