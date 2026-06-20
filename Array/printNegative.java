import java.util.*;

public class printNegative {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a size :");
        int n = SC.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter an Array element :");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = SC.nextInt();
        }

         for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
            System.out.print(arr[i]+" ");
        }

    }
}