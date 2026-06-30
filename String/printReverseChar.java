public class printReverseChar {
    public static void main(String[] args) {
    char[] str = {'h','e','l','l','o'};
    int n = str.length;
        int i = 0;
        int j  = n-1;

        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
             i++;
             j--;
        }
       
        System.out.print(str);
    }
}