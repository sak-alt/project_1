package GeneralCoreJavaProgram.Collections.ListImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVectorThread {
    public static void main(String[] args) throws InterruptedException {
        int value = 10000000;
        Thread t1 = null, t2 = null;
        System.out.println("Elements in the Vector" + " " + elementsInTheVector(value, t1, t2));
        System.out.println("Elements in the ArrayList" + " " + elementsInTheArrayList(value, t1, t2));
    }

    public static long elementsInTheVector(int value, Thread t1, Thread t2) throws InterruptedException {
        List<Integer> vectorList = new Vector<>();
        t1 = new Thread(() -> {
            for (int i = 0; i < value; i++) {
                vectorList.add(i);
            }
        });
        t2 = new Thread(() -> {
            for (int i = 0; i < value; i++) {
                vectorList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        return vectorList.size();
    }

    public static long elementsInTheArrayList(int value, Thread t1, Thread t2) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        t1 = new Thread(() -> {
            for (int i = 0; i < value; i++) {
                arrayList.add(i);
            }
        });
        t2 = new Thread(() -> {
            for (int i = 0; i < value; i++) {
                arrayList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        return arrayList.size();
    }
}
