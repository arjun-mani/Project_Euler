import java.util.*;
import java.io.*;

public class Problem22 {
	
	public static void main(String[] args) throws IOException {
		int sum = 0;
		ArrayList <String> names = new ArrayList <String> ();
		Scanner in = new Scanner(new File("/Users/arjunsubramaniam/Desktop/Python/names.txt")).useDelimiter(",");
		while(in.hasNext()) {
			names.add(in.next());
		}
		
		Collections.sort(names);
		for(int i = 1; i <= names.size(); i++) {
			sum += i * (wordvalue(names.get(i - 1)));
		}
		
		System.out.println(sum);
		
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
