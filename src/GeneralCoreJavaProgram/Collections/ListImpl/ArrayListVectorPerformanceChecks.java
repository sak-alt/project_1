package GeneralCoreJavaProgram.Collections.ListImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVectorPerformanceChecks {
    public static void main(String[] args) {
        int value = 10000000;
        System.out.println("Time Taken for Vector" + " " + timeToAddElementInVector(value));
        System.out.println("Time Taken for ArrayList" + " " + timeToAddElementInArrayList(value));
    }

    public static long timeToAddElementInVector(int value) {
        long start = System.currentTimeMillis();
        List<Integer> vectorList = new Vector<>();
        for (int i = 0; i < value; i++) {
            vectorList.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long timeToAddElementInArrayList(int value) {
        long start = System.currentTimeMillis();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
