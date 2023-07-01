package GeneralCoreJavaProgram.Collections.SetImpl;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithSortedSetInterfaceExample {
    public static void main(String[] args) {
        SortedSet<String> stringSet = new TreeSet<>();

        stringSet.add("N");
        stringSet.add("C");
        stringSet.add("H");
        stringSet.add("A");
        stringSet.add("K");
        stringSet.add("D");

        SortedSet<Integer> stringSetInteger = new TreeSet<>();

        stringSetInteger.add(4);
        stringSetInteger.add(2);
        stringSetInteger.add(6);
        stringSetInteger.add(1);
        stringSetInteger.add(9);
        stringSetInteger.add(3);

        System.out.println(stringSet.size());
        System.out.println(stringSet);

        System.out.println(stringSetInteger.size());
        System.out.println(stringSetInteger);

        System.out.println(stringSet.first());
        System.out.println(stringSet.last());
    }
}
