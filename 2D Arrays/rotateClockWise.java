public class rotateClockWise {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 4, 1, 6},
                {7, 4, 9, 1},
                {1, 3, 2, 6},
                {8, 6, 9, 2}
        };

        System.out.println("Original Matrix:");
        print(arr);

        // Step 1: Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < arr.length; i++) {
            int stCol = 0;
            int endCol = arr[0].length - 1;

            while (stCol < endCol) {
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;

                stCol++;
                endCol--;
            }
        }
        print(arr);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Har row ke baad next line
        }
        System.out.println();
    }
}