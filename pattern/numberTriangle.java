import java.util.*;
public class numberTriangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}