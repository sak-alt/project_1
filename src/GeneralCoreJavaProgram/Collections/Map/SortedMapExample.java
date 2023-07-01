package GeneralCoreJavaProgram.Collections.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> stringIntegerMap = new TreeMap<>();
        stringIntegerMap.put("Shruti", 1);
        stringIntegerMap.put("Nitesh", 2);
        stringIntegerMap.put("Apple", 3);
        stringIntegerMap.put("Kumar", 4);
        stringIntegerMap.put("Shruti", 5);
        System.out.println(stringIntegerMap);
    }
}
