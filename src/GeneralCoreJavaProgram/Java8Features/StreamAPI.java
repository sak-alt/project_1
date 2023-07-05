package GeneralCoreJavaProgram.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(30);
        integerList.add(50);
        integerList.add(60);

        integerList.stream().forEach(System.out::println);
    }
}
