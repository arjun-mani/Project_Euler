
public class Problem112 {
	
	public static void main(String[] args) {
		
		int bouncy = 0;
		
		for(int i = 1; ; i++) {
			if(isBouncy(i))
				bouncy++;
			
			if(bouncy * 100 == i * 99)
				System.out.println(i);
		}
		
		
	}
	
	public static boolean isBouncy(int n) {
		
		if(n < 100)
			return false;
		
		else {
			boolean nonincreasing = true;
			boolean nondecreasing = true;
			int lastdigit = n % 10;
			
			while(n != 0) {
				int digit = n % 10;
				if(digit > lastdigit)
					nondecreasing = false;
				if(digit < lastdigit)
					nonincreasing = false;
				lastdigit = digit;
				n /= 10;
				
			}
			
			return !nondecreasing && !nonincreasing;
		}
		
		
	}
	

}
