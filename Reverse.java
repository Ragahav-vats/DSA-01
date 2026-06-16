import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        int r = 0;

        while(n != 0) {
            r *= 10;
            r += (n % 10);
            n /= 10;
        }

        System.out.println(r);
    }
}