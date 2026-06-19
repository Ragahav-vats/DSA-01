import java.util.*;

public class combinationAndPermutation {
    public static int fact(int x) {
        int f = 1;
        for(int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
         Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();
        int r = SC.nextInt();

        int ncr = fact(n) / fact(r) * fact(n-r);
        int npr = fact(n) / fact(n-r);
        System.out.println(ncr+" "+npr);
    }
}