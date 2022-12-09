package day08nestedif;

public class C02_NestedIf {
 /*
    Password'un ilk harfi buyuk harf ise
     'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
     Passwordun ilk harfi kucuk harf ise
      'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin

       A ==> gecerli
        B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z==> gecersiz

        a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y ==> gecersiz
        z ==>gecerli

     */

    public static void main(String[] args) {

        String pwd ="5xy12!";
        char ilkHarf =pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){
            if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }

        }else if(ilkHarf>='a'  && ilkHarf<= 'z'){
            if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }

        }else{
            System.out.println("Ilk Karakter Harf Olmali");
        }
    }
}
