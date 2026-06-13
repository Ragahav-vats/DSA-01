
import java.util.*;

public class IsInteger {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number : ");
        
        double n = SC.nextDouble(); // 3.14

        int x = (int)n; // 3

        if(n-x == 0) {
            System.out.println("Is an integer");
        } else {
           System.out.println("Not an Integer"); 
        }
    }
}