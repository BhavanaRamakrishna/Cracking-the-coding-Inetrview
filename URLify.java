import java.util.*;
import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
      String s1 = args[0];
      char[] c1 = s1.toCharArray();
      ArrayList<Character> chars = new ArrayList<Character>();
      for (Character c : c1) {
          if (c == ' '){
              chars.add('%');
              chars.add('2');
              chars.add('0');
          }
          else
            chars.add(c);
      }
      String word= new String();
      for(char c:chars){
      word= word+ c;
      }
      System.out.println(word);

      }
}
/* O(n) if n - length of the string*/
