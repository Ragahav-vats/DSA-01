public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 0;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(arr[mid] == target) {
                System.out.println("Element is found at index: " + mid);
                return;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(low > high) {
            System.out.println("Element not found at index");
        }
    }
}