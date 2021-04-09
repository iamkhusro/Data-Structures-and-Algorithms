public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(1);
        list.insertAtHead(7);
        list.insertAtHead(12);
        System.out.println(list);
        System.out.println(list.length());
        list.deleteFromHead();
        System.out.println(list);
        System.out.println(list.length());
        System.out.println("Found: " + list.find(7));
        System.out.println("Found: " + list.find(55));
    }
}
