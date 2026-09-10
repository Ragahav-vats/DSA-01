class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class Maximum {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(7);
        Node g = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println(max(a));

         System.out.println(levels(a));
    }
    public static int levels(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

}