public class indexElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 9, 4, 3};

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 1) {
                arr[i] *= 2;
                System.out.print(arr[i]+" ");
            }
            else {
                arr[i] += 10;
                 System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}