public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,3,6,5};
        int[] b = {1,7,9,10,90};

        int[] c = new int[a.length+b.length];
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        } 
        System.out.println();
        merge(c,a,b);
         for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        } 
        System.out.println();

    }
    public static void merge(int c[], int a[], int b[]) {
        int i = 0; 
        int j = 0; 
        int k = 0;

        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) {
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
        if(i == a.length) { // a ka size khtm ho gya h b ke ele ko print kr do
            while( j<b.length) {           
                c[k] = b[j];
                j++;
                 k++;           
        }
        }
        else {
            while( i<a.length) {           
                c[k] = a[i];
                i++;
                 k++;           
        }
        }
    }
}