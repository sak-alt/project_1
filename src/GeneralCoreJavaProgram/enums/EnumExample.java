package GeneralCoreJavaProgram.enums;

public class EnumExample {
    public static void main(String[] args) {
        WeekDay day = WeekDay.SATURDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("It is a weekend");
                break;
            case SATURDAY:
                System.out.println("It is a working day");

        }
        System.out.println(day);
    }
}
