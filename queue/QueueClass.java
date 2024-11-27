package queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // enqueue => offer()
        queue.offer(10);
        queue.offer(20);

        // dequeu => poll()
        System.out.println(queue.poll());

        // peek => element()
        System.out.println(queue.element());

        // 
        System.out.println(queue.size());
    }
}
