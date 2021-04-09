public class Node {
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public void setData(int data) {
        this.data = data;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    public int getData() {
        return this.data;
    }
    public Node getNextNode() {
        return this.nextNode;
    }
    @Override
    public String toString() {
        return Integer.toString(data);
    }
}
