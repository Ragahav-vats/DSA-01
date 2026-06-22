 public class missingNumber{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
       int ans = missingNum(arr);
       System.out.println(ans+" ");
    }
   static int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arraySum = 0 ;
        
        for(int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return (int)(sum - arraySum);
    }
}