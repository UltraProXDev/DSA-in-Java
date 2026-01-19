import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class AllQueue{
    static void simpleQueue(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: "+queue);
        int removed = queue.remove();
        System.out.println("Removed: "+removed);
        System.out.println("Queue after dequeue: "+queue);
    }

    static void dequeDemo(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(20);
        deque.addFirst(10);
        deque.addLast(30);
        System.out.println("Deque: "+deque);
        int front = deque.removeFirst();
        int rear = deque.removeLast();
        System.out.println("Removed from front: "+front);
        System.out.println("Removed from rear: "+rear);
        System.out.println("Deque after removals: "+deque);
    }
    public static void main(String[] args) {
        simpleQueue();
        dequeDemo();
    }
}
