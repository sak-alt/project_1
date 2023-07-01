package GeneralCoreJavaProgram.Collections.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Integer> stringIntegerMap = new TreeMap<>();
        stringIntegerMap.put("Shruti", 1);
        stringIntegerMap.put("Nitesh", 2);
        stringIntegerMap.put("Apple", 3);
        stringIntegerMap.put("Kumar", 4);
        System.out.println(stringIntegerMap.firstEntry());
        System.out.println(stringIntegerMap.lastEntry());
        System.out.println(stringIntegerMap.descendingMap());
        System.out.println(stringIntegerMap);
    }
}