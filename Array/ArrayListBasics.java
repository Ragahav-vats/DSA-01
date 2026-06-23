import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = arr.size(); // arr.length()
        arr.add(21);
        arr.add(11);
        arr.add(10);
        arr.add(8);
        arr.add(15);

        System.out.println(arr.get(2)); // second index ke element ko print krne ke liye
        arr.set(3,19);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.print(arr);

       }
}