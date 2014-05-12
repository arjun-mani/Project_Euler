import java.io.*;

public class Problem67 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("/Users/arjunsubramaniam/Desktop/Python/triangle.txt"));
		int [][] tree = new int [100][];
		for(int i = 0; i < 100; i++) {
			tree[i] = new int[i + 1];
			String [] values = in.readLine().split(" ");
			for(int j = 0; j <= i; j++) {
				tree[i][j] = Integer.parseInt(values[j]);
			}
		}
		
		for(int i = tree.length - 2; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				tree[i][j] += Math.max(tree[i + 1][j], tree[i + 1][j + 1]);
			}
		
		}
		
		for(int [] row : tree)
			printRow(row);
		
		System.out.println(tree[0][0]);
		
	}
	
	public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
    
}
