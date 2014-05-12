import java.util.Scanner;
import java.io.*;

public class Problem81 {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("/Users/arjunsubramaniam/Desktop/Python/matrix.txt"));
		in.useDelimiter(",|\n|\r");
		int [][] matrix = new int [80][80];
		for(int i = 0; i < 80; i++) {
			for(int j = 0; j < 80; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		for(int i = matrix.length - 1; i >= 0; i--) {
			for(int j = matrix[i].length - 1; j >= 0; j--) {
				int count = 0;
				if(i + 1 < matrix.length && j + 1 < matrix[i].length)
					count += Math.min(matrix[i][j + 1], matrix[i + 1][j]);
				else if(i + 1 < matrix.length)
					count += matrix[i + 1][j];
				else if(j + 1 < matrix[i].length)
					count += matrix[i][j + 1];
				else
					count = 0;
				matrix[i][j] += count;
			}
		}
		
		System.out.println(matrix[0][0]);
		in.close();
		
	}
	

}
