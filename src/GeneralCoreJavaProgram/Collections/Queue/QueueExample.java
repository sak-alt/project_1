package GeneralCoreJavaProgram.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> integers = new PriorityQueue<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);
        System.out.println(integers);
        System.out.println(integers.peek());
        System.out.println(integers.offer(70));
        System.out.println(integers.add(80));
        // To-Review
        System.out.println(integers.remove());
        System.out.println(integers);
    }
}
