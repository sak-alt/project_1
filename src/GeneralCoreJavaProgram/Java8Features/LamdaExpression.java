package GeneralCoreJavaProgram.Java8Features;

import java.util.LinkedList;
import java.util.List;

public class LamdaExpression {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Nitesh");
        stringList.add("Bhushan");
        stringList.add("Nitesh");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        for (String s : stringList) {
            System.out.println(s);
        }
        stringList.forEach(s -> {
            System.out.println(s);
        });
    }
}
