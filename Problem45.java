
public class Problem45 {
	
	public static void main(String[] args) {
		long tri = 286;
		long pent = 166;
		long hex = 144;
		boolean found = false;
		
		while (! found) {
			long triangle = (tri * (tri + 1)) / 2;
			long pentagon = (pent * ((3 * pent) - 1)/2);
			long hexagon = (hex * ((2*hex) - 1));
			
			long min = Math.min(Math.min(triangle, pentagon) , hexagon);
			
			if(min == triangle && min == pentagon && min == hexagon) {
				System.out.println(min);
				found = true;		
			}
			
			else {
				if(min == triangle) tri++;
				if(min == pentagon) pent++;
				if(min == hexagon) hex++;
			}
				
		}
	}
	
}
	
