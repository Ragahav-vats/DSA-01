import java.util.*;
public class binaryTriangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
              
            }
            System.out.println();
        }
    }
}