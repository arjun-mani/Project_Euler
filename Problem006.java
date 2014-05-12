
public class Problem6 {
    
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			sum += i;
		}
	  System.out.println(sum*sum - squaresum(101));
	}


  public static int squaresum(int end) {
	  int sum1 = 0;
	  for(int i = 0; i < end; i++) {
		  sum1 += i * i;
	  }
	  
	  return sum1;
  }
	  
}
  
