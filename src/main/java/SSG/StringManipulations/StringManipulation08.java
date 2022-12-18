package SSG.StringManipulations;

public class StringManipulation08 {
    /*
    Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
    yazınız
     */
    public static void main(String[] args) {
        String str = "Ömer faruk.";
        char ilkkaraker = str.charAt(0);
        char sonkarakter = str.charAt(str.length() - 1);
        boolean ilkkarakerbuyukmu = ilkkaraker >= 'A' && ilkkaraker <= 'Z';
        boolean sonkarakternoktami = sonkarakter == '.';
        boolean ikisinikontrol = ilkkarakerbuyukmu && sonkarakternoktami;
        System.out.println(ikisinikontrol);
    }
}
