import java.util.*;

public class userData {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = SC.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(i +"");
            System.out.println(n - i + 1);
        }
        
    }
}