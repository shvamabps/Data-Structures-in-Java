package queue;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        Queue q = new Queue();
        // q.enQueue(5);
        // q.enQueue(2);
        // q.enQueue(7);5
        // q.enQueue(3);

        q.deQueue();
        q.deQueue();
        // q.enQueue(17);
        // q.enQueue(13);
        System.out.println(q.isEmpty());
        System.out.println("Size : " + q.getSize());

        q.show();
    }
}