package GeneralCoreJavaProgram.Collections.ListImpl;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(20);
        integerList.add(30);
        integerList.add(50);
        integerList.add(60);

        System.out.println(integerList.size());
        System.out.println(integerList.get(2));
        System.out.println(integerList.remove(2));
        System.out.println(integerList);
    }
}
