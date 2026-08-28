public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 3, 2};

        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}