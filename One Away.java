import java.util.Scanner;
import java.util.BitSet;
public class OneAway{

	public static String oneAway(String s1, String s2){
		int n = s1.length()>s2.length() ? s1.length() : s2.length();
		System.out.println(n);
		char[] longer = s1.length()>s2.length() ? s1.toCharArray() : s2.toCharArray();
		char[] shorter = s1.length()>s2.length() ? s2.toCharArray() : s1.toCharArray();
		BitSet bs = new BitSet(n);
		int flag = 0;
		int[] array = new int[n];
		int j=0;
		if(s1.length() == s2.length())
			flag = 1;
		for(int i=0;i<n ;i++){
			System.out.println("vd");
			System.out.println(longer[i]);
			System.out.println(shorter[j]);
			if(longer[i]==shorter[j]){
				j++;
			}
			else{
				System.out.println(longer[i]);
				if(flag ==1)
				{
					j++;
					System.out.println("s");
				}
				bs.set(i);
			}

		}
		if(bs.cardinality() != 1)
			return "False";
		else
			return "True";
		}
		public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		if(Math.abs(s1.length() - s2.length()) >1)
			System.out.println("False");
		else
			System.out.println(oneAway(s1,s2));
		in.close();
	}
}
