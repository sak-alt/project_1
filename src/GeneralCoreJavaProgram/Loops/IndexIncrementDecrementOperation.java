package GeneralCoreJavaProgram.Loops;

public class IndexIncrementDecrementOperation {
    public static void main(String[] args) {
        int numberAddition = 5;
        int numberSubtraction = 5;
        numberAddition = numberAddition++;
        System.out.println(numberAddition + " " + "In case when numberAddition++");

        numberAddition = ++numberAddition;
        System.out.println(numberAddition + " " + "In case when ++numberAddition");

        numberSubtraction = numberSubtraction--;
        System.out.println(numberSubtraction + " " + "In case when numberSubtraction++");

        numberSubtraction = --numberSubtraction;
        System.out.println(numberSubtraction + " " + "In case when ++numberSubtraction");
    }
}
