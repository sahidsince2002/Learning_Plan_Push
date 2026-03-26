class Solution {
    public static String reverse(String s) {
        String var2 = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            var2 += s.charAt(i);
        }
        
        return var2;
    }
}

public class StrRev {
    public static void main(String[] args) {
        String str = Solution.reverse("Sahid");
        System.out.println(str);
    }
}