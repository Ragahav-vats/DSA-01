
public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length + 1;
        System.out.print(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for(int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
        }
        int missing = totalSum - arraySum;

        return missing;
    }
}
