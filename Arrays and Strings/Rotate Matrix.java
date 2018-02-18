import java.util.Scanner;
public class RotateMatrix{
		public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] array = new int[n][n];
		int[][] narray = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				array[i][j] = in.nextInt();
			}
		}
		int k = 0;
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<n;j++){
				narray[j][k] = array[i][j];
				k = (k+1)%n;
				System.out.print(narray[j][k%n]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}

		in.close();
	}
}
