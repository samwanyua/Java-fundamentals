public class Type_conversion {
    public static void main(String[] args) {
        /*
         * Type  conversion and casting
         * 
         */

        // byte b  = 127;
        // int a = 12;

        // b = (byte) a; // casting - explict conversion
        // System.out.println(b);

        // a = b; // implicit conversion (automatic)
        float f = 23.23f;
        int x = (int) f;
        System.out.println(x);

        // Type promotions
        byte height = 10;
        byte age = 30;

        int result = age * height;
        System.out.println(result);







    }
}
