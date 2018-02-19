public class MagicIndex{
	public static int getIndex(int[] arr, int s, int e){
		int mid = (s+e)/2;
		if(arr[mid]==mid)
			return mid;
		else if(arr[mid]>mid)
			return getIndex(arr,s,mid-1);
		else
			return getIndex(arr, mid+1,e);
	}
	 public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
				  array[i] = in.nextInt();
		System.out.println("Magic Index with distinct values");
		System.out.println(getIndex(array, 0, n));
		in.close();
	 }
}
