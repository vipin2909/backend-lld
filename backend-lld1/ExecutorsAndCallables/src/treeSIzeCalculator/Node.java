package treeSIzeCalculator;

public class Node {
    public int data;
    public Node left, right;
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
