public class StairCase{
	public static int stairCase(int n, int[] memo){
		if(memo[n]>-1)
			return memo[n];
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 4;
		else{
			for(int i=4;i<=n;i++){
				memo[i] = stairCase(i-1, memo) + stairCase(i-2, memo) + stairCase(i-3, memo);
			}
		}
		return memo[n];
	}
	 public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] memo = new int[n+1];
		for(int i=0;i<=n;i++)
			memo[i] = -1;
		System.out.println(stairCase(n,memo));
		in.close();
	 }
}
