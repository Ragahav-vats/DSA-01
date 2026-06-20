public class maxNumber {
    public static void main(String[] args) {
        int[] arr = {3,23,2,12,65,9,5};
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}