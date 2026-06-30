public class columnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,1},{20,21,12,16},{9,6,4,8}};

        for(int j = 0; j < 4; j++) {
            for(int i = 0; i < 3; i++) {
             System.out.print(arr[i][j]+" ");   
            }
            System.out.println();
        }
    }
}