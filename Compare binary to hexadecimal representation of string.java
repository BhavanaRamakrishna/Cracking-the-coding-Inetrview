import java.util.Scanner;
public class MyClass {
	public static int getValueOf(char a){
		if(Character.isDigit(a))
			return Character.getNumericValue(a);
		else{
			switch(Character.toLowerCase(a)){
				case 'a': return 10;
				case 'b': return 11;
				case 'c': return 12;
				case 'd': return 13;
				case 'e': return 14;
				case 'f': return 15;
				default: return -1;
			}
		}
	}
	public static int getInt(String number, int base){
		int value = 0;
		for(int i=number.length()-1;i>=0;i--){
			int d = getValueOf(number.charAt(i));
			System.out.println(d);
			if(d == -1 || d>=base)
				return -1;
			int exp = number.length() - 1 -i;
			value += d*Math.pow(base,exp);
		}
		return value;
	}
	public static boolean areEqual(String bin, String hexa){
		int m = getInt(bin,2);
		int n = getInt(hexa, 16);
		if(m<0 || n<0)
			return false;
		return m==n;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String binary = in.nextLine();
		String hexadecimal = in.nextLine();
		System.out.println(areEqual(binary, hexadecimal));
	}
}
