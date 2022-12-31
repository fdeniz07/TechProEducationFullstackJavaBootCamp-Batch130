package ssg.ssg08ifelsenestedif;

public class NestedIf03 {
    public static void main(String[] args) {

      /*
         Parolayı kontrol etmek için kodu yazın
         8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır
         En fazla 8 karakter içeriyorsa, baş harfi 'K' olmalıdır.
         İç içe Tenrary  kullanarak görevi çözün
      */

        //length(), bir String da  karakter sayısını döndürür

        String pwd = "iaby3f5122";

        String isValid = (pwd.length() > 8) ? (pwd.charAt(0) == 'i' ? "i icin valid password" : "i cin Not Valid") :
                (pwd.charAt(0) == 'K' ? "K icin valid password" : " K icin Not Valid");

        System.out.println(isValid);

    }
}
