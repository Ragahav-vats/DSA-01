public class ReverseRow {
    public static void main(String[] args) {
        int[][] arr = {{5,3,7,8},{8,2,5,1},{9,0,4,5}};
        reverse(arr);

        for(int i = 0; i < arr.length; i++) {
         for(int j = 0; j < arr[0].length / 2; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][arr[0].length - 1 - j];
            arr[i][arr[0].length - 1 - j] = temp;
        }
        }
        reverse(arr);
    }
    public static void reverse(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}