//string concat using string builder

import java.lang.StringBuilder;
import java.lang.String;

public class StringBuilderConcat {
    public static void main(String[] args) {
        String arr[] = {"I","am","Hamza","Ali","Mazari","from","Karachi"};
        StringBuilder sb = new StringBuilder();

      for (String arr2 : arr) {
        sb.append(arr2).append(" ");
      }
      System.out.println(sb);
    }
}
