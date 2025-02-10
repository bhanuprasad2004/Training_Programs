class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
public class PrintLinkedList {
    Node head;

    void addvalue(int data) {
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

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        PrintLinkedList list = new PrintLinkedList();
        list.addvalue(10);
        list.addvalue(20);
        list.addvalue(30);
        list.addvalue(40);
        System.out.println("Linkedlist: ");
        list.print();
    }   
}
