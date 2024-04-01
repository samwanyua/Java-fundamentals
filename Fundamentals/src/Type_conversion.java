public class Type_conversion {
    public static void main(String[] args) {
        /*
         * Type  conversion and casting
         * 
         */

        byte b  = 127;
        int a = 12;

        // b = (byte) a; // casting - explict conversion
        // System.out.println(b);

        // a = b; // implicit conversion (automatic)
        float f = 23.23f;
        int x = (int) f;
        System.out.println(x);

        // Type promotions
        byte h = 10;
        byte g = 30;

        int result = g * h;
        System.out.println(result);







    }
}
