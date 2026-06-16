
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;           
        }
        System.out.println(fact);
    }
}