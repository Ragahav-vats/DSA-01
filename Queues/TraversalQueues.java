import java.util.Queue;
import java.util.LinkedList;

public class TraversalQueues {
    public static void display(Queue<Integer> q) {
        int n = q.size();
     for(int i = 1; i <= n; i++) {
        System.out.print(q.peek()+" ");
        q.add(q.remove());
     }
     System.out.println();
    }
     public static void main(String[] args) {
     Queue<Integer> q = new LinkedList<>();
     q.add(10);  
     q.add(20);
     q.add(30);
     q.add(40);
     display(q);
     
     addAtIndex(q,2,60);
     display(q);

     peekAtIndex(q,2,60);
     display(q);

     removeAtIndex(q,2,60);
     display(q);
    }
    public static void addAtIndex(Queue<Integer> q,int idx,int val) {
        if(idx < 0 || idx > q.size()) {
            System.out.print("Invalid Index!");
            return;
        }
        int n = q.size();
        for(int i = 1; i <= idx; i++) {
            q.add(q.remove());
        }
        q.add(val);
        for(int i = 1; i <= n-idx; i++) {
            q.add(q.remove());
        }
    }
    public static void removeAtIndex(Queue<Integer> q,int idx,int val) {
       if(idx < 0 || idx > q.size()) {
            System.out.print("Invalid Index!");
            return;
        }
        int n = q.size();
        for(int i = 1; i <= idx; i++) {
            q.add(q.remove());
        }
        q.remove(val);
        for(int i = 1; i <= n-idx-1; i++) {
            q.add(q.remove());
        }
    }
    public static void peekAtIndex(Queue<Integer> q,int idx,int val) {
        if(idx < 0 || idx > q.size()) {
            System.out.print("Invalid Index!");
            return;
        }
        int n = q.size();
        for(int i = 1; i <= idx; i++) {
            q.add(q.remove());
        }
        System.out.print(q.peek()+" ");
        for(int i = 1; i <= n-idx; i++) {
            q.add(q.remove());
        }
    }
}