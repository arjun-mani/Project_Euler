
public class Problem9 {
	
	public static void main(String[] args) {
		int Limit = 1000;
		
		for(int a = 0; a < Limit; a++) {
			for(int b = 0; b < Limit; b++) {
				for(int c = 0; c < Limit; c++) {
					if(a + b + c == 1000 && (a*a + b*b) == c*c)
						System.out.println(a*b*c);
				}
			}
		}
	}
	
	

}
