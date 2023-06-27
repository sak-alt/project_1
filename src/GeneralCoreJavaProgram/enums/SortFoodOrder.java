package GeneralCoreJavaProgram.enums;

public class SortFoodOrder {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (Enum foodItem : FoodItems.values()) {
                if (FoodItems.valueOf(String.valueOf(foodItem)).sequence == i) {
                    System.out.println(foodItem+" "+i);
                }
            }
        }
    }
}
