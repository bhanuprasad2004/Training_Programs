class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class InorderTraversal {
    Node root;

   // Inorder Traversal: Left -> Root -> Right
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data +" ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node== null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();
        
        tree.root = new Node(1);


        tree.root.left = new Node(2);
        tree.root.right = new Node(3);


        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

     
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("Pre Order");
        tree.preorder(tree.root);

        System.out.println("Post Order");
        tree.postorder(tree.root);
    }
}
