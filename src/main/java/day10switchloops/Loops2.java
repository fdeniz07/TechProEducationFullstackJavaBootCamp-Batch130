package day10switchloops;

public class Loops2 {

    public static void main(String[] args) {

        //Example 1: 21'den  180'e kadar hem 4 hem de 6 ile bölünebilen tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }
        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan karakterlerini büyük harf yapiniz
        //           ankara ==> AnKaRa

        //Note : Yazdiginiz kod belli senaryolar icin calisiyor, tüm senaryolar icin calismiyorsa bu koda "Hardcode" denir ve Hardcode yanlis yazilmis koddur. Mutlaka düzeltilmelidir.


        //Note: Bir String'de son index lenght-1 dir.
        System.out.println("******* Example 2 ********");

        String s = "ankara";
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);

            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }
        }
    }
}
