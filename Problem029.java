
import java.util.ArrayList;

public class Problem29 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); 
			
		for (double a = 2; a <= 100; a++) {
			for (double b = 2; b <= 100; b++) {

				double pow = Math.pow(a, b);

				if (!al.contains(pow))
					al.add(pow);

			}
		}

		System.out.println(al.size());
	}

}

