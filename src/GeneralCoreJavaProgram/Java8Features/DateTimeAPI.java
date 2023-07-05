package GeneralCoreJavaProgram.Java8Features;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
