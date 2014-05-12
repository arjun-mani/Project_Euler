import java.util.Scanner;
import java.io.IOException; 
import java.io.FileReader;
import java.io.File;

public class Problem42 {
	
	public static void main(String[] args) throws IOException {
		int count = 0;
		 Scanner in = new Scanner(new File("words.txt")).useDelimiter(",");
		  while(in.hasNext()) {
			  String s = in.next();
			  if(isTriangular(s))
				  count++;
				  
		  }
		  
		System.out.println(count);
		
		
		
			
		
	}
	
	public static boolean isTriangular(String s) {
		int n = wordvalue(s);
		if(Math.sqrt(8 * n + 1) == (int) Math.sqrt(8 * n + 1)) {
			return true;
		}
		
		return false;
	}
	
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static int getvalue(char c) {
		return alphabet.indexOf(c) + 1;
		
	}
	
	public static int wordvalue(String word) {
		char [] array = word.toCharArray();
		int sum = 0;
		for(char c: array) {
			sum += getvalue(c);
		}
		return sum;
	}

}
