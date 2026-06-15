import java.util.*;

public class Composite {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        for(int i = 2; i < n-1; i++) {
            if(n % i == 0) {
                System.out.println("composite number");
                break;
            }
        }

    }
}