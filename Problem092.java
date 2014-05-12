
public class Problem92 {
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 2; i  < 10000000; i++) {
			if(end89(i))
				count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean end89(int n) {
		while (true) {
			switch (n) {
				case  1:  return false;
				case 89:  return true;
				default:  n = nextnumber(n);
			}
		}
	}
	
	public static int nextnumber(int n) {
		
		int sum = 0;
		
		while(n != 0) {
			sum += (int) Math.pow(n % 10, 2);
			n /= 10;
		}
		
		return sum;
	}

}
