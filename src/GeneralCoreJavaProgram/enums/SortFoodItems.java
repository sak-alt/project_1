package GeneralCoreJavaProgram.enums;

public class SortFoodItems {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (FoodItems foodItem : FoodItems.values()) {
                if (foodItem.sequence == i) {
                    System.out.println(foodItem);
                }
            }
        }
    }
}
