package GeneralCoreJavaProgram.CollectionsPackage;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Nitesh");
        stringList.add("Bhushan");
        System.out.println(stringList);
        System.out.println(stringList.get(0));
        System.out.println(stringList.size());
    }
}
