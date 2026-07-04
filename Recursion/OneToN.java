import java.util.*;

public class OneToN {
        public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        print(1,n);
    }
    public static void print(int x, int n) {
       if(x > n) return;
       System.out.println(x);
       print(x+1,n); 
    }
    }
