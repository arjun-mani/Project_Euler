import java.util.Arrays;


public class Problem52 {
	
	public static void main(String[] args) {
		outer:
		for(int a = 1; ; a++) {
			for(int b = 2; b < 6; b++) {
				if(! isPerm(a * b, a * (b + 1)))
					continue outer;
			}
			
			System.out.println(a);
		}
	
	
	}
	
	public static boolean isPerm(int a, int b) {
		char [] adigits = Integer.toString(a).toCharArray();
		char [] bdigits = Integer.toString(b).toCharArray();
		
		Arrays.sort(adigits);
		Arrays.sort(bdigits);
		
		return Arrays.equals(adigits, bdigits);
		

  }
}