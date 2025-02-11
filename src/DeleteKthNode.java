class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteKthNode {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void delete(int k) {

        if (head == null || k <= 0) {
            return;
        }
        if (k == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < k - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            System.out.print("--> " + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteKthNode list = new DeleteKthNode();
        System.out.println("Linked List : ");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.print();
        System.out.println();

        System.out.println("Deleting the kth Node : ");
        int k = 4;
        list.delete(k);

        list.print();
        System.out.println();

        System.out.println("Deleting the LastNode");
        list.deleteLastNode();
        list.print();
    }
}
