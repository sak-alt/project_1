package GeneralCoreJavaProgram;

public class DataType {
    public static void main(String[] args) {

        // It can store between -2,147,483,648 to 2,147,483,647
        int valueInt = 10;
        Integer valueInteger = 10;

        // It can store upto approx 15 decimal digits
        double valueDouble = 20.00d;
        Double valueDoubles = 20.00d;

        // It can store the Character value from A to Z
        //Single Quote is Character else in double quotes its String.
        char valueCharacters = 'A';
        Character valueCharacterss = 'A';

        //Stores true or false values
        boolean valueBoolean = false;
        Boolean valueBooleans = false;

        // It can store between -128 to 127
        byte valueByte = 126;
        Byte valueBytes = 126;

        // It can store between -32,768 to 32,767
        short valueShort = 32767;
        Short valueShorts = 32767;

        // It can store upto approx 6 to 7 decimal digits
        float valueFloat = 23.211222f;
        Float valueFloats = 23.211222f;

        // It can store between  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long valueLong = 7739127937L;
        Long valueLongs = 7739127937L;

        System.out.println(valueInt);
        System.out.println(valueDouble);
        System.out.println(valueCharacters);
        System.out.println(valueByte);
        System.out.println(valueBoolean);
        System.out.println(valueShort);
        System.out.println(valueFloat);
        System.out.println(valueLong);


        System.out.println(valueCharacterss);
        System.out.println(valueBooleans);
        System.out.println(valueBytes);
        System.out.println(valueShorts);
        System.out.println(valueFloats);
        System.out.println(valueDoubles);
        System.out.println(valueInteger);
        System.out.println(valueLongs);
    }
}
