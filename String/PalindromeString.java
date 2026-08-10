
public class PalindromeString {
    public static boolean reverse(String s) {
        int i = 0, j = s.length()-1;
        while(i <= j) {__
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(reverse(s));
    }
}