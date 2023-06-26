package GeneralCoreJavaProgram.enums;

public class FoodSelection {
    public static void main(String[] args) {
        for (Enum anEnum : FoodItems.values()) {
            System.out.println(anEnum + " " + FoodItems.valueOf(String.valueOf(anEnum)).sequence);
        }
    }
}
