import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        boolean flag = true; // prime no

        for(int i = 2; i < n-1; i++) {
            if(n % i == 0) {
                flag = false; // false means composite
                break;
            }
        }
        if(n == 1){
            System.out.println("neither prime nor composite");
        }
        else if(flag == false) {
            System.out.println("composite number");
        } else {
             System.out.println("prime number");
        }

    }
}