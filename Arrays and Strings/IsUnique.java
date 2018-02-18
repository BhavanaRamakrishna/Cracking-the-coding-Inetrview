import java.util.HashMap;

public class MyClass {
    public static void main(String args[]) {
        String s = args[0];
        int flag = 0;
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            if (chars.containsKey(c)){
                flag = 1;
                break;
            }
            chars.put(c,1);
        }
        if(flag>0)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}
/* O(n) if n - length of the string */
