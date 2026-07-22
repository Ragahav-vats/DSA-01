import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // System.out.print(st);
        int ele = 50;
        
        Stack<Integer> temp = new Stack<>();
        while(st.size() > 0) {
            temp.push(st.pop());
        }
        
        st.push(50);

        while(temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}