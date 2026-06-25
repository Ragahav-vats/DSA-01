public class MoveAllZeroes {
    public static void main(String[] args) {
        int[] arr = {2, -1, 0, 9, 0, -2, 0};
        int n = arr.length;

         for(int i = 0; i < n-1; i++) {// n-1 passes ke liye loop
            for(int j = 0; j < n-1; j++) { // arr ke element ko check krne ke liye loop
                if(arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}