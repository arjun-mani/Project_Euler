
public class Problem85 {
	
	public static void main(String[] args) {
		int limit = 2000000;
		int bestdiff = Integer.MAX_VALUE;
		int bestarea = -1;
		
		for(int n = 1; n <= Math.sqrt(limit); n++) {
			for(int m = 1; m <= Math.sqrt(limit); m++) {
				int diff = Math.abs(countrectangles(n, m) - limit);
				if(diff < bestdiff) {
					bestdiff = diff;
					bestarea = n * m;
				}
			}
		}
		
		System.out.println(bestarea);
	}
	
	public static int countrectangles(int n, int m) {
		return (m * (m + 1) * n * (n + 1)) / 4;
		
	}

}
