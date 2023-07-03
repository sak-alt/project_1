package GeneralCoreJavaProgram.CollectionsPackage;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Nitesh");
        stringList.add("Bhushan");
        System.out.println(stringList);
        System.out.println(stringList.get(0));
        System.out.println(stringList.size());
    }
}
