class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountOfNodes {
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

    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
        CountOfNodes list = new CountOfNodes();
        list.addvalue(10);
        list.addvalue(20);
        list.addvalue(30);
        list.addvalue(40);
        list.addvalue(50);

        list.print();
        System.out.println("Count of Nodes: " + list.countNodes());
        
    }
}
