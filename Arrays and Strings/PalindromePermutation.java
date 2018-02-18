import java.util.HashMap;
public class MyClass {
    public static void main(String args[]) {
        String s = args[0];
        char[] c = s.toCharArray();
        int fl = 0;
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
        if (s.length() == 1){
            System.out.println("Yes");
            return;
        }
        for ( char ch : c ){
            if( ch == ' '){
                continue;
            }
            if(!chars.containsKey(ch)){
                chars.put(ch,1);
            }
            else{
                chars.put(ch, chars.get(ch) + 1);
            }
        }
        for (char key : chars.keySet()) {
            if(chars.get(key) % 2 == 1){
                if(fl == 0)
                    fl = 1;
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("Yes");
}
}
/* O(n) if n - length of the string*/
