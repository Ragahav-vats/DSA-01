import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        // output

        // int[] arr = {3,53,32,43,1,22,44};

        // System.out.println(arr.length);
        // for(int i = 0; i <= 6; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        //  for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        int[] arr = new int[7];

        // input
        for(int i = 0; i < 7; i++) {
            int x = SC.nextInt();
            arr[i] = x;
        }
        // print
          for(int i = 0; i < 7; i++) {
           System.out.print(arr[i]+" ");
        }


    }
}