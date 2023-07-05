package GeneralCoreJavaProgram.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopsLambdaExpressionExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        //Lambda Function For Loop.
        integerList.forEach(integer -> {
            System.out.print(integer);
        });
    }
}
