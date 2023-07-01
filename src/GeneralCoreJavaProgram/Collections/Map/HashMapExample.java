package GeneralCoreJavaProgram.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Shruti", 1);
        stringIntegerMap.put("Nitesh", 2);
        System.out.println(stringIntegerMap);
        System.out.println(stringIntegerMap.remove("Shruti"));
        System.out.println(stringIntegerMap.get("Shruti"));
    }
}
