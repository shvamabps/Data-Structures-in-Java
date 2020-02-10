package linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);
        list.insertAt(2, 55);
        list.insertAt(0, 36);

        list.deleteAt(5);
        list.show();
    }
}