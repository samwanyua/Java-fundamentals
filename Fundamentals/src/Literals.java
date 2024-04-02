public class Literals{
    public static void main(String[] args) {
        // Data types
        /*
         * Primitives data types (Basic):
            * Int : byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
            * Float: double(8 bytes - default in Java), float(4 bytes - default in C language)
            * Char : 2 bytes (1 byte in c/c++ language)
            * Boolean
         * 
         * 
         */
        int num1 = 9; 
        // byte by = 127;
        // short sh = 559;
        // long l = 3242l;

        // float f = 5.8f;
        // double d = 5.8;

        char c = 'E';
        c++;
        System.out.println(c); //F
        
        // boolean b = true;

        /*Literals 
         * 9 in num1 is a literal
         */
        int num2 = 0b101;
        int num3 = 0x7E;
        // int num4 = 100_000_000; // 100000000
        System.out.println(num2); // 5
        System.out.println(num3); // 126

    }
}