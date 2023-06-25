package GeneralCoreJavaProgram.Loops;

import java.util.ArrayList;
import java.util.List;

public class ForLoopsExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        //Lambda Function For Loop.
        integerList.forEach(integer -> {
            System.out.print(integer);
        });

        //For Loop Index Based.
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i));
        }

        //For Each Loop
        for (Integer integer : integerList) {
            System.out.print(integer);
        }
    }
}
