package ssg.ssg01variablesdatatypes;

public class Variable01 {

    //Variable olusturmak
    //Java cumlesi = Statement
    //Java'da esittir demek "==". Yani Matematik'de "=", Java'dd "=="
    //Java'da "=" "assignment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
    //Access Modifier yazmazsaniz "access modifier" "default" demektir
    //Data Type + Variable Name ==> Variable Declaration
    //Assignment Operator(Atama Operatoru)  + Variable degeri ==> Assignment
    //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini(default) koyar.
    //Default degerler sayilar icin sifirdir.
    // Data Type'ini yaziniz   Variable ismi yaziniz  Assignment Operator(Atama Operatoru)   Variable degeri   Ingilizce'deki nokta gibi

    public static void main(String[] args) {
        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu saecmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak
        // variable'imizin data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu seceiliriz
        // biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz

        int level = 1;

        System.out.println(level);


        boolean ogrenciMi = true;

        boolean yagisVarMi = false;

        System.out.println(ogrenciMi);

        char ozelSembol = '&';
        char sayi = '2';
        char harf = 'K';
        System.out.println(harf);


        //adı age olan bir tamsayı değişkeni yaratıyorum
        int age = 12;
        //adı baş harf olan bir char değişkeni yaratıyorum
        char initial = 'A';
        //yaş ve başlangıç değişkenlerinin değerlerini konsola yazdıralım
        System.out.println(age);
        System.out.println(initial);
       /*3 tamsayı değişken oluşturun, onlara değer atayın,
             a) Bunları konsolda tek tek yazdırın
          b) 3 tamsayının toplamını yazdır
          c) 3 tamsayının toplamını başında bir etiketle yazdırın. Örnek: 'Toplam 39'dur'
          */
        int i01 = 12, i02 = 13, i03 = 14;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);

        System.out.println(i01 + i02 + i03);
        System.out.println("The sum is " + i01 + i02 + i03);// The sum is 121314
        System.out.println("The sum is " + (i01 + i02 + i03));
        int sum = i01 + i02 + i03;
        System.out.println("The sum is " + sum);
        //2 tamsayı değişkeni oluşturun ve bunların çarpımını bir etiketle konsolda yazdırın
        int i04 = 15, i05 = 16;

        System.out.println("The multiplication is " + i04 * i05);// The multiplication is 240
        System.out.println("The subtraction is " + (i05 - i04));// The subtraction is 1
        System.out.println("The devision is " + i05 / i04);// The devision is 1


        /*
            Order of Operations in Math
            1)Do the operations inside the parenthesis first
            2)Do multiplication and division
            3)Do addition and subtraction
        */
    }
}
