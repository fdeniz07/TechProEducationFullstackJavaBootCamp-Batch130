package day28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {


        //Compile Time Error == Kodlarin yazim asamasinda olusan hatalardir CTE
        // Run Time Error == Kodlari calistirdiktan sonra olusan hata tipi  RTE


        /*
        1) NumberFormatException
         */

        // Bir String'i alip int'a ceviren kodu yaziniz

        String str = "123";//happyScenario positive Scenario

        int result = convertStringToInteger(str);//Stringi integer'a cevir
        System.out.println("result+5 = " + (result + 5));//128  1235

        String st = "123a";//Negative Scenario
        int result2 = convertStringToInteger(st);
        System.out.println("(result2+10) = " + (result2 + 10));

    }

    private static int convertStringToInteger(String str) {
        //ctrl +alt+t
        int i = 0;

        try {
            i = Integer.valueOf(str);
            System.out.println("Burasi try Bolumu : " + i);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez");
        }
        return i;
    }


}
