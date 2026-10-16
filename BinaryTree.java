class BinaryTree{

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // Sum of all nodes
    int sum(Node node) {
        if (node == null)
            return 0;

        return node.data + sum(node.left) + sum(node.right);
    }

    // Maximum value
    int max(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        return Math.max(node.data,
                Math.max(max(node.left), max(node.right)));
    }

    // Minimum value
    int min(Node node) {
        if (node == null)
            return Integer.MAX_VALUE;

        return Math.min(node.data,
                Math.min(min(node.left), min(node.right)));
    }

    // Count number of nodes
    int count(Node node) {
        if (node == null)
            return 0;

        return 1 + count(node.left) + count(node.right);
    }

    // Height of tree
    int height(Node node) {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /*
                10
               /  \
              5    20
             / \   / \
            2   7 15  30
        */

        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(7);

        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(30);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nSum = " + tree.sum(tree.root));
        System.out.println("Maximum = " + tree.max(tree.root));
        System.out.println("Minimum = " + tree.min(tree.root));
        System.out.println("Count = " + tree.count(tree.root));
        System.out.println("Height = " + tree.height(tree.root));
    }
}