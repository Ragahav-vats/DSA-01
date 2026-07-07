public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,6,2,16,56,9,87};
        int target = 16;
        System.out.print(exists(arr,target,0));
    }
    public static boolean exists(int[] arr, int target, int idx) {
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return exists(arr,target,idx+1);
    }
}