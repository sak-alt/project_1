package GeneralCoreJavaProgram.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StackOverflowError {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            integers.add(random.nextInt());
        }
        System.out.println(integers);
    }
}
