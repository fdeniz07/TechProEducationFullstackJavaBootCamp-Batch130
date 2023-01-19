package day28exceptions;

public class C06_Exceptions {

    public static void main(String[] args) {

        //String'i Integer'a ceviriniz ; Integer'i character sayisina bolunuz

        double d = divideString(null);
        System.out.println(d);
        double d2 = divideString2(null);
        System.out.println(d2);

    }

    public static double divideString(String str) {
        int length = 0;//NullPointerException
        int i = 0;
        double sonuc = 0;

        try { //1 tane try dan sonra multiple catch kullanabilirsiniz.Sira onemli degildir
            length = str.length();
            i = Integer.valueOf(str);
            sonuc = i / length;
        } catch (NullPointerException e) {
            System.out.println(" Nullpointer Exception verdi " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException Exception verdi " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(" ArithmeticException Exception verdi " + e.getMessage());
        }
        return sonuc;
    }

    public static double divideString2(String str) {
        int length2 = 0;//NumberFormatException
        int i = 0;
        double sonuc = 0;
        try {
            length2 = str.length();
            i = Integer.valueOf(str);
            sonuc = i / length2;

        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException Exception verdi " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" 911 Exception verdi " + e.getMessage());
        }
        return sonuc;
    }
}
