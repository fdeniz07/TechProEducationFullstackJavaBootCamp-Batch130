package practice.regular_practice.practiceDTNT.practice07;

public class C01_Exceptions {

    //Verilen iki String'in uzunluk acisindan birbirinin kac kati oldugunu veren kodu yaziniz

    public static void main(String[] args) {

        double r1 =karakterSayisiniKarsilastir("Tester","Devoloper");
        System.out.println(r1);
        double r2 =karakterSayisiniKarsilastir("Tester","");
        System.out.println(r2);
        double r3 =karakterSayisiniKarsilastir(null,"MehmetG");
        System.out.println(r3);
    }

    private static double karakterSayisiniKarsilastir(String str1, String str2) {
        double result = 0;

        try {
            result=str1.length()/ str2.length();
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Payda sifir olamaz ==> " + e.getMessage());
            //   e.printStackTrace();
        }  catch (NullPointerException e) {
            System.err.println("lenght methodu null ile hata verir ==> "+e.getMessage());
        } finally {
            System.out.println("Database ile baglanti kesilsin...");
        }
        return result;

    }
}
