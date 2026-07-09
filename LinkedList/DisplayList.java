class Node {
    int val;
    Node next; // default null

    Node(int val) { // constructor
        this.val = val;
    }
}

public class DisplayList {
    public static void display(Node head) {
        Node temp = head; // eske jagah pe direct head bhi use mai le sakte h
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // display(a);

        System.out.println(get(a, 2));

    }

    public static int get(Node head, int idx) {
        for(int i = 1; i <= idx; i++) {
            head = head.next;
        }
        return head.val;
    }
}