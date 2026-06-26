public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {2, -1, 6, 9, 0, -2};
        int n = arr.length;
        

        for(int i = 0; i < n-1; i++) { // n-1 passes ke liye loop
        int minIdx = i;
            for(int j = i+1; j < n; j++) { // arr ke element ko check krne ke liye loop
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
             // Swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}