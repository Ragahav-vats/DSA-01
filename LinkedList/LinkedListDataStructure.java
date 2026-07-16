class Node {
    int val;
    Node next; // default null

    Node(int val) { // constructor
        this.val = val;
    }
}

class Linkedlist { // user defined data structure
    Node head;
    Node tail;
    int size;
    
    void addAtTail(int val) {
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

     void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAtHead() {
        if(head == null) {
            System.out.print("list is empty");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }
     void display() {
         Node temp = head; // eske jagah pe direct head bhi use mai le sakte h
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
     }
     void delete(int idx) {
        if(idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if(idx == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i = 1; i <= idx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size-1) tail = temp; // delete a tail
        size--;
     }
     void insert(int val, int idx) {
        if(idx < 0 || idx > size) System.out.println("Invalid index");
        else if(idx == 0) addAtHead(val);
        else if(idx == size) addAtTail(val);
        else {
            Node temp = head;
            for(int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
             temp.next = t;
             size++;
        } 
     }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.display();
        ll.addAtTail(60);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);

        ll.insert(25,2);
        ll.display();
        ll.delete(3);
        ll.display();

    }
}