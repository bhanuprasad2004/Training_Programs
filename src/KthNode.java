class Node{
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
public class KthNode {
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

    int find(int k) {
        if (head == null || k <= 0) {
            return -1;
        }
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (count == k) {
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    void print() {
        Node temp = head;
        while (temp != null)  {
            System.out.print(temp.data + " ");
            System.out.print("-->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        KthNode list = new KthNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.print();

        int k = 3;
        int kth = list.find(k);
        if (kth != -1) {
            System.out.println(kth);
        } else {
            System.out.println("Out of bounds");
        }
    

    }
}
