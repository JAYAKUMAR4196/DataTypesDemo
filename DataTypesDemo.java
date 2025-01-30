public class DataTypesDemo {
    public static void main(String[] args) {
        byte byteValue = 100;        // 1 byte
        short shortValue = 10000;    // 2 bytes
        int intValue = 100000;       // 4 bytes
        long longValue = 100000L;    // 8 bytes

        float floatValue = 10.5f;    // 4 bytes
        double doubleValue = 20.99;  // 8 bytes

        char charValue = 'A';        // 2 bytes

        boolean booleanValue = true; // 1 bit

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}
