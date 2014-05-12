import java.util.ArrayList;

public class Problem109 {
	
	private static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
		int result = 0;
		ArrayList <Integer > scores = new ArrayList <Integer> ();
		ArrayList <Integer> doubles = new ArrayList <Integer> ();
		
		for(int i = 1; i <= 20; i++) {
			scores.add(i);
			scores.add(2 * i);
			scores.add(3 * i);
		}
		
		scores.add(25);
		scores.add(50);
		
		for(int i = 1; i <= 20; i++) {
			doubles.add(2 * i);
		}
		
		doubles.add(50);
		
		for(int item: doubles) {
			if(item < 100)
				result++;
			
		}
		
		for(int i = 0; i < scores.size(); i++) {
			for(int item: doubles) {
				if(scores.get(i) + item < 100)
					result++;
			}
		}
		
		for(int i = 0; i < scores.size(); i++) {
			for(int j = i; j < scores.size(); j++) {
				for(int item: doubles) {
					if(scores.get(i) + scores.get(j) + item < 100)
						result++;
				}
			}
		}
		
		System.out.println(result);
		long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
		
	}
	

}
