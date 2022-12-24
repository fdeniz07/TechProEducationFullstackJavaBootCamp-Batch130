package practice.regular_practice.variablesdaytime01;

public class C01_Variables {

    public static void main(String[] args) {

        // byte; short; integer ; long ; double; float Data Type'larinin max ve min degerlerini yazdiran kodu yaziniz

        byte byteMax = Byte.MAX_VALUE; //-128
        byte byteMin = Byte.MIN_VALUE; //127
        System.out.println("byteMin = " + byteMin + "\n" + "byteMax = " + byteMax);

        short shortMin = Short.MIN_VALUE; //-32768
        short shortMax = Short.MAX_VALUE; //32767
        System.out.println("shortMin = " + shortMin + "\n" + "shortMax = " + shortMax);

        int intMin = Integer.MIN_VALUE; //-2147483648
        int intMax = Integer.MAX_VALUE; //2147483647
        System.out.println("intMin = " + intMin + "\n" + "intMax = " + intMax);

        long longMin = Long.MIN_VALUE; //-9223372036854775808
        long longMax = Long.MAX_VALUE; //9223372036854775807
        System.out.println("longMin = " + longMin + "\n" + "longMax = " + longMax);

        double doubleMin = Double.MIN_VALUE; //4.9E-324
        double doubleMax = Double.MAX_VALUE; //1.7976931348623157E308
        System.out.println("doubleMin = " + doubleMin + "\n" + "doubleMax = " + doubleMax);

        float floatMin = Float.MIN_VALUE; //1.4E-45
        float floatMax = Float.MAX_VALUE; //3.4028235E38
        System.out.println("floatMin = " + floatMin + "\n" + "floatMax = " + floatMax);

    }
}
