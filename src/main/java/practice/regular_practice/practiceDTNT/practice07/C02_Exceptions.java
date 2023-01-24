package practice.regular_practice.practiceDTNT.practice07;

public class C02_Exceptions {
    /*
   rastgeleSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */

    public static void main(String[] args) {

        rastgeleSayi();

        System.out.println("Durmak yok Yola DEvam");
    }

    private static void rastgeleSayi() {
        int sayi1= (int)(Math.random()*10);
        int sayi2= (int)(Math.random()*10);

        System.out.println(sayi1+"=="+sayi2);
        int toplam= 0;
        try {
            toplam = sayi1+sayi2;
            System.out.println(toplam);
            if(toplam<12){
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Toplam 12 den buyuk olsun    "+e.getMessage());
        } finally {

            System.out.println("Database ile baglanti kesildi");
        }

    }
}
