
public class Problem12 {
	
	public static void main(String[] args) {
		
		int i = 1;
        int x = 2;
        boolean found = false;
        while (!found) {
            if (divcount(i) > 500) {
                System.out.println(i);
                found = true;
            }
            else {
                i +=x;
                x++;
            }
        }
			    
	}
	
	public static int divcount(int n) {
		int count = 0;
		
		for(long i = 1; i*i <= n; i++) {
			if(n % i == 0)
				count += 2;
		}
		
		return count;
	}
	
}
