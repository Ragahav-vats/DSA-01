import java.util.*;
public class starTriangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}