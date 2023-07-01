package GeneralCoreJavaProgram.Collections.SetImpl;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Sakhi");
        stringSet.add("Kumar");
        stringSet.add("Nitesh");
        stringSet.add("Shruti");
        stringSet.add("Nitesh");
        stringSet.add("Bhushan");

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("Shruti"));
        System.out.println(stringSet);
    }
}
