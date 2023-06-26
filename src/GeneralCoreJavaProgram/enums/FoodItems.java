package GeneralCoreJavaProgram.enums;

public enum FoodItems {
    BIRYANI(1), ICE_CREAM(5), MANCHURIAN(3), NOODLES(4), PANEER_BUTTER_MASALA(2);
    final int sequence;

    public int getSequence() {
        return sequence;
    }

    FoodItems(int sequence) {
        this.sequence = sequence;
    }
}
