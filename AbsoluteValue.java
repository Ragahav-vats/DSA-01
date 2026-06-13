import java.util.*;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = SC.nextInt();

        // if(n >= 0) {
        //      System.out.println(n);
        // }
        //  else {
        //     System.out.println(-n);
        //  }

        if(n < 0) n = -n ;
        System.out.println(n);

    }
}