
public class Problem10 {
	
	public static void main(String[] args) {
		
		int count = 2000000;
		long sum = 0;
		
		for(int i = 2; i <= count; i++) {
			if(isPrime(i)){
				sum += i;
				System.out.println(sum);
			}
			
		//maybe use ln	
		}
		
		
	}
	
	
	
	public static boolean isPrime(int arg) {
		
		
		int newCount;
		
		if(arg > 2 && arg % 2 == 0)
			return false;
		
		for(int i = 3;i <= Math.sqrt(arg); i++) {
			if(arg % i == 0)
				return false;
		}
			
			
			
			    
		
		
		return true;
		
		
	}

}
