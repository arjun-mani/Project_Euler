
public class Problem86 {
	
	public static void main(String[] args) {
		int count = 0;
		int l = 2;
		int target = 1000000;
		while(count < target) {
			l++;
			for(int wh = 3; wh < 2 * l; wh++) {
				double sqrt = Math.sqrt((wh * wh) + (l * l));
				if(isInteger(sqrt)) {
					if(wh <= l)
						count += wh / 2;
					else
						count += (l - (wh + 1) / 2);
				}
			}
		}
		
		System.out.println(l - 2);
		
		
	}
	
	public static boolean isInteger(double n) {
		if(n == (int) n) {
			return true;
		}
		
		return false;
	}

}
