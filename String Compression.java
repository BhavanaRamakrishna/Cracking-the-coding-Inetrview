import java.util.Scanner;
import java.util.BitSet;
import java.util.ArrayList;
public class Compress{
		public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		ArrayList<Character> characters = new ArrayList();
		ArrayList<Integer> counts = new ArrayList();
		StringBuilder fin= new StringBuilder();
		char prev = s1.charAt(0);
		int count = 1;
		for(int i=1;i<s1.length();i++){
			if(s1.charAt(i) == prev)
				count ++;
			else{
				characters.add(prev);
				counts.add(count);
				count = 1;
				prev = s1.charAt(i);
			}
		}
		characters.add(prev);
		counts.add(count);
		for(int i=0;i<characters.size();i++){
			fin.append(characters.get(i));
			fin.append(counts.get(i));
		}
		if(characters.size() == s1.length())
			System.out.println(s1);
		else
			System.out.println(String.valueOf(fin));
		in.close();
	}
}
