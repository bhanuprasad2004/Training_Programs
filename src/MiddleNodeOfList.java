class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNodeOfList {
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

    int findmiddle() {
        if (head == null) {
            return -1;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp.data;
       // System.out.println(temp.data);
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MiddleNodeOfList list = new MiddleNodeOfList();
        list.addvalue(10);
        list.addvalue(20);
        list.addvalue(30);
        list.addvalue(40);
        list.addvalue(50);
        list.addvalue(60);

        list.print();
        System.out.println(list.findmiddle());
    }
}

