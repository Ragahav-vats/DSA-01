import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push("Raghav");
        st.push("Ishita");
        st.push("Ankit");
        st.push("Ram");
        st.push("Mohan");
        st.push("Shankar");

        System.out.println(st.size());
        System.out.println(st); // print whole string
        st.pop();
        System.out.println(st);
        System.out.println(st.peek()); // peek top most no ya string ko point krta h 
        System.out.println(st.pop()); // it returns the top element and then removes it
        String s = st.pop() // s mai store karana
        
    }
}