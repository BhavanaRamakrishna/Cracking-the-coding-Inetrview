import java.util.Scanner;
public class ParenPairs{
	public static void printParens(int left, int right, String s){
		if(right== 0){
			System.out.println(s);
			return;
		}
		if(left>0){
			printParens(left-1, right, s+"(");
			if(left < right)
				printParens(left, right-1, s+")");
		}
		else
			printParens(left, right-1, s+")");


	}

	 public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printParens(n,n,"");

	 }
}
