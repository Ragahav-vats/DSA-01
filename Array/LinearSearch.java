 public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {12, 32, 2, 15, 10};
        int target = 3;

        boolean flag = false; // target array mai nhi h 

        for(int i = 0; i < arr.length; i++) {
           if(arr[i] == target) {
            flag = true;
            break;
           }
        }
         if(flag == true) {
                System.out.println("Target exist");
            }
            else {
                System.out.println("Target does not exist"); 
            }

    }
 }