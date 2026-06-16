import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();

        int pow = 1;

        for(int i = 1; i<=b; i++) {
            pow *= a;
        }
        System.out.println(a+" raise to the power "+b+" is "+ pow);
    }
}