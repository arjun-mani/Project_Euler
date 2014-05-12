
public class Problem3 {

	public static void main(String[] args) {
		long counter = 0;
		long number = 24;
		
		for(counter = 2; counter < number; counter++) {
			if(number % counter == 0)
				if(checkPrime(counter))
					System.out.println(counter);
		}

	}
	
	public static boolean checkPrime(long arg) {
		
		boolean match = true;
		long newCount;
		
		for(newCount = 2; newCount < arg; newCount++) {
			if(arg % newCount == 0)
				match = false;
			    
		}
		
		return match;
	}

}
