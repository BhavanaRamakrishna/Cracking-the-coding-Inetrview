import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        String s1 = args[0];
        String s2 = args[1];
        if (s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        if (Arrays.equals(c1,c2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

/* O(n) if n - length of each string*/
