class Node {
    Node prev;
    String data;
    Node next;

    Node(String data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    static Node head;
    static Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    public static void insert(String data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node currentnode = head;
            while (currentnode.next != null) {
                currentnode = currentnode.next;
            }
            currentnode.next = node;
            node.prev = currentnode;
            tail = node;
        }
    }

    public static void print() {
        System.out.println(tail.data);
    }
}