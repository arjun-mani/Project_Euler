
public class Problem39 {
	
	public static void main(String[] args) {
		
		int maxPerimeter = 0;
		int maxTriangles = 0;
		
		for(int i = 1; i <= 1000; i++) {
			int triangle = rightcount(i);
			if(triangle > maxTriangles) {
				maxTriangles = triangle;
				maxPerimeter = i;
				
			}
		}
		
		System.out.println(maxPerimeter);
	}
	
	public static int rightcount(int n) {
		
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				int k = n - i - j;
					if(j <= k && (i*i + j*j) == k*k)
						count++;
				
			}
		}
		
		return count;
	}

}
