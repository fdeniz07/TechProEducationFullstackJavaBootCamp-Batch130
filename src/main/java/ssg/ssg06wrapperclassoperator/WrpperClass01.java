package ssg.ssg06wrapperclassoperator;

public class WrpperClass01 {
    public static void main(String[] args) {
/*
         Primitive            Wrapper
          byte     ==>        Byte
          short    ==>        Short
          int      ==>        Integer *****
          long     ==>        Long
          float    ==>        Float
          double   ==>        Double
          boolean  ==>        Boolean
          char     ==>        Character  *****
 */

        char ch = 'A';

        System.out.println(ch);

        Character wch = ch;
        System.out.println(wch);

        int num1 = 26;
        Integer num2 = num1;

        Short wsh = 30;

        short sh = wsh;

        //Ex : short data type'inin en kucuk ve en buyuk degerini ekrana yazdirin

        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);//-32768 32767


    }
}
