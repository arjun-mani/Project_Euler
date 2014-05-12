
public class Problem2 {

	public static void main(String[] args) {
		int fib1 = 1;
		int fib2 = 1;
		int fib3;
		
		int sum = 0;
		
		while((fib3 = fib1 + fib2) < 4000000) {
			if(fib3 % 2 == 0)
				sum += fib3;
			fib1 = fib2;
			fib2 = fib3;
			
		}
		
		System.out.println(sum);

	}

}
