import java.util.*;

public class NToOne {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        print(n);
    }
    public static void print(int n) {
       if(n == 0) return;
       System.out.println(n);
       print(n-1); 
        
    }
}