import java.util.*;
public class starTriangleHori {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}