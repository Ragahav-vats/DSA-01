public class printMinimum {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,1},{20,21,12,16},{9,6,4,8}};
        int minNum = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++) {
            int maxNum = arr[i][0];
            for(int j = 0; j < 4; j++) {
                if(arr[i][j] > maxNum) {
                    maxNum = arr[i][j];
                }
            }
            if(minNum > maxNum) {
                minNum = maxNum;
            }
        }
        System.out.println(minNum+" ");
    }
}