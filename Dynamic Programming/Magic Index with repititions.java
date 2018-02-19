public class MagicIndex{
	public static int getIndex(int[] arr, int s, int e){
		if(e<s)
			return -1;
		int mid = (s+e)/2;
		if(arr[mid]==mid)
			return mid;
		//search left
		int  l = Math.min(mid-1, arr[mid]);
		int left = getIndex(arr, s, l);
		if(left>=0)
			return left;
		
		//search right
		int r = Math.max(mid+1, arr[mid]);
		return getIndex(arr, r, e);
	}
	 public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
				  array[i] = in.nextInt();
		System.out.println("Magic Index with repeated values");
		System.out.println(getIndex(array, 0, n-1));
		in.close();
	 }
}
