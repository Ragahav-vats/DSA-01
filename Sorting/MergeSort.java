public class MergeSort {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};

        int[] c = mergeSort(a, b);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
    public static int[] mergeSort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i == a.length) {
            while(j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        else {
             while(i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        return c;
    }
}