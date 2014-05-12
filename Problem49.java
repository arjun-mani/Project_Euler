import java.util.ArrayList;
import java.util.Collections;

public class Problem49 {
	

	
	public static void main(String[] args) {
		for(int a = 1000; a < 10000; a++) {
			for(int b = a+1; b < 10000; b++) {
				for(int c = b+1; c < 10000; c++) {
					if(b - a == c - b && isPrime(a) && isPrime(b) && isPrime(c) && isequal(a, b, c)) {
						System.out.println("A: " + a);
						System.out.println("B: " + b);
						System.out.println("C: " + c);
					}
				}
			}
			
		}
	}
	
	public static boolean isequal(int a, int b, int c) {
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		ArrayList<Integer> three = new ArrayList<Integer>();
		
//		System.out.println(a);
		while(a != 0) {
			int k = a % 10;
			one.add(k);
			a /= 10;
		}
		Collections.sort(one);
		
/*		for(int i = 0; i < one.size(); i++) {
			System.out.println(one.get(i));
		}*/
		
		while(b != 0) {
			int k = b % 10;
			two.add(k);
			b /= 10;
		}
		Collections.sort(two);
		
		while(c != 0) {
			int k = c % 10;
			three.add(k);
			c /= 10;
		}
		Collections.sort(three);
		
		boolean match = true;
		
		for(int i = 0; i < one.size(); i++) {
			if(one.get(i) != two.get(i) || one.get(i) != three.get(i))
				match = false;
				
		}
		
		return match;
		
	}
	
    public static boolean isPrime(int arg) {
		
		
		if(arg > 2 && arg % 2 == 0)
			return false;
		
		for(int i = 3;i <= Math.sqrt(arg); i++) {
			if(arg % i == 0)
				return false;
		}
			
			
	    return true;
	}

}
