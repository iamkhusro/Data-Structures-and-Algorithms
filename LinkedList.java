public class LinkedList {
    private Node head;
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }
    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }
    public Node find(int data) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == data)
                return current;
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        String res = "[";
        Node current = this.head;
        while (current != null) {
            res = res + current.toString() + ",";
            current = current.getNextNode();
        }
        return res+"\b]";
    }
    public int length() {
        Node current = this.head;
        int len = 0;
        if (current == null)
            return 0;
        while (current != null) {
            len++;
            current = current.getNextNode();
        }
        return len;
    }
}
