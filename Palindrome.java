import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();
        int original = n;
        int reverse = 0;

        while(n != 0) {
            reverse *= 10;
            reverse += (n % 10);
            n /= 10;
        }
        if(original == reverse) {
            System.out.println("palindrome no");
        } else {
            System.out.println("not a palindrome no");
        }
    }
}