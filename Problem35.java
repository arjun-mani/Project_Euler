
public class Problem35 {
	
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i < 1000000; i++) {
			if(isCircular(i))
				count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean isCircular(int n) {
		String s = Integer.toString(n);
		for(int i = 0; i < s.length(); i++) {
			if(!isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i)))) {
				return false;
			}
			
		}
		
		return true;
	}
	
    public static boolean isPrime(int arg) {
	
		if(arg == 1)
			return false;
		
		if(arg > 2 && arg % 2 == 0)
			return false;
		
		for(int i = 3;i <= Math.sqrt(arg); i++) {
			if(arg % i == 0)
				return false;
		}
	    return true;

   }	
}
	
     
