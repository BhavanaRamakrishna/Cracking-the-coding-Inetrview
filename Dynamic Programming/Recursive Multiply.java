import java.util.Scanner;
public class RecursiveMultiply{
	public static int multiply(int small, int big){
		if(small == 0)
			return small;
		else if(small==1)
			return big;
		int mid = small>>1;
		int half = multiply(mid,big);
		if(small%2 ==0)
			return half + half;
		else
			return half + half + big;

	}

	 public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println(m<n?multiply(m,n):multiply(n,m));
		in.close();
	 }
}
