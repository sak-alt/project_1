package GeneralCoreJavaProgram.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueExamples {
    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);
        System.out.println(integers);
        System.out.println(integers.peek());
        System.out.println(integers.removeFirst());
        System.out.println(integers.removeLast());
        System.out.println(integers.offer(70));
        System.out.println(integers.add(80));
        System.out.println(integers.remove());
        System.out.println(integers);
    }
}
