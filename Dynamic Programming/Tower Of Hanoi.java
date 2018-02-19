
public class TowerOfHanoi{
	public static void towerOfHanoi(int n, char from, char to, char buffer){
		if(n==1){
			System.out.println(" 1 from " + from  + " to " + to);
			return;
		}
		towerOfHanoi(n-1,from,buffer,to);
		System.out.println( n + " from " + from  + " to " + to);
		towerOfHanoi(n-1,buffer,to,from);
	}

	 public static void main(String []args){
		int n = 5;
		towerOfHanoi(n, 'A', 'B', 'C');

	 }
}
