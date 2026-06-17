import java.util.*;
public class hollowTriangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int m = SC.nextInt();
        int n = SC.nextInt();

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
              if(i == 1 || i == m || j == 1 || j == n) {
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}