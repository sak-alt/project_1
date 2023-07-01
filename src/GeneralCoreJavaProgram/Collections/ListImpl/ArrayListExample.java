package GeneralCoreJavaProgram.Collections.ListImpl;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(30);
        integerList.add(50);
        integerList.add(60);

        System.out.println(integerList.size());
        System.out.println(integerList.get(2));
        System.out.println(integerList.remove(2));
        System.out.println(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Nitesh");
        stringList.add("Nitesh");
        stringList.add("Shruti");
        stringList.add("Sakhi");

        System.out.println(stringList.size());
        System.out.println(stringList);
    }
}
