import java.util.*;

public class Ap {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        // for(int i = 2; i <= 3*n-1; i+=3) {
        //     System.out.println(i+ "");
        // }

        int a = 2 ; 
        int d = 3;

        for(int i = 1; i <= n; i++) {
            System.out.println(a +"");
            a+=d;
        }

    }
}