public class Segregate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1};
        segregate0and1(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
   static void segregate0and1(int[] arr) {
        // code here
        
        int i = 0;
        int j = arr.length-1;
        
        while(i < j) {
            
            while(i < j && arr[i] == 0) {
            i++;
        }
        
        while(i < j && arr[j] == 1) {
            j--;
        }
        
        if(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        }
        
    }
}