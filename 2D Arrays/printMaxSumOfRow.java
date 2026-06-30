public class printMaxSumOfRow {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,1},{20,21,12,16},{9,6,4,8}};
        int maxSum = 0;
        int row = 0;

        for(int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            if(sum > maxSum) {
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(maxSum+" "+row);
    }
}