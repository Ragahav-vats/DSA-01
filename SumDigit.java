import java.util.*;

public class SumDigit {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        int sum = 0;

        while(n != 0) {
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}