package GeneralCoreJavaProgram.Collections.ListImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStructures {
    public static void main(String[] args) {

        //Collection
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        System.out.println(integerList);

        //Map
        Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put("Nitesh", 10);
        System.out.println(integerMap.get("Nitesh"));
    }
}
