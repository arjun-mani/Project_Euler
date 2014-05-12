import java.util.ArrayList;

public class Problem7 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i = 2; i < 1000000; i++) {
			if(isPrime(i))
				al.add(i);
		}
		
		System.out.println(al.get(10000));
		
		
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
