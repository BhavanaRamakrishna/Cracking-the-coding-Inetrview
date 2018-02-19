import java.util.Scanner;
import java.util.ArrayList;
public class PowerSet{
	public static ArrayList<ArrayList<Integer>> getSubsets(int[] a){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		for(int i: a){
			int size = result.size();
			for(int j=0;j<size;j++){
				ArrayList<Integer> l = new ArrayList<Integer>();
				l.add(i);
				result.add(l);
			}
		}
		return result;
	}

	 public static void main(String []args){
		int[] array = {9,3,7};
		ArrayList<ArrayList<Integer>> subsets = getSubsets(array);
		System.out.println(subsets);
	 }
}
