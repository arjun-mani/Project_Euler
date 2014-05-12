
public class Problem14 {
	
	public static void main(String[] args) {
		
		long maxsequence = 0;
		long maxN = 1;
		
		for(int i = 2; i < 1000000; i++) {
			
			long seqlength = 1;
			long n = i;
			
			while(n > 1) {
				if(n % 2 == 0)
					n = n / 2;
				
				else
					n = (3 * n) + 1;
				seqlength++;
			}
			
			if(seqlength > maxsequence) { 
				maxsequence = seqlength;
			    maxN = i;
			}
		}
		
		System.out.println(maxN);
	}

}
