package GeneralCoreJavaProgram.Collections.SetImpl;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();

        stringSet.add("Bhushan");
        stringSet.add("Kumar");
        stringSet.add("Nitesh");
        stringSet.add("Sakhi");
        stringSet.add("Shruti");
        stringSet.add("Nitesh");

        System.out.println(stringSet.size());
        System.out.println(stringSet);
    }
}
