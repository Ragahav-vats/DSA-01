import java.util.*;

public class maxOfThree {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        int c = SC.nextInt();
        int d = SC.nextInt();

        // System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}