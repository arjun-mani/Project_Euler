
public class Problem76 {
	
	public static void main(String[] args) {
		Problem76 problem = new Problem76();
		System.out.println("TOTAL COUNT: " + printPartitions(5));
		
	}
	
	private static int count;
	
	public static int printPartitions(int target)
	{
	   count = 0;
	   printPartitions(target, target, "");
	   return count;
	}
	
	private static int printPartitions(int target, int max, String suffix)
	{
	    if (target == 0) {
	       System.out.println(suffix);
	       count++;
	    }
	    else
	    {
	       for (int i = 1; i <= max && i <= target; i++)
	          printPartitions(target - i, i, i + " " + suffix);
	    }
	    
	    return count;
	}
	
	
}
