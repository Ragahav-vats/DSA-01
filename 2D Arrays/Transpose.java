public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{2,4,1,6},{7,4,9,1},{1,3,2,6},{8,6,9,2}};
        print(arr);

        // Transpose
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}