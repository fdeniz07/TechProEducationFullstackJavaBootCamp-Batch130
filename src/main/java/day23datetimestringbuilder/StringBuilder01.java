package day23datetimestringbuilder;

public class StringBuilder01 {
    /*
        Java da String , "String Class"  kullaninarak veya "StringBuilder Class" kullanilarak olusturulabilir.
        "String Class" kullanilarak urettiginiz String'ler "Immutable"( degistirelemez) dir.
        "StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirelebilir) dir.
    */

    public static void main(String[] args) {

        //Immutable

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.


        //Her degisiklik memory nin heap bölümünde baska bir container olusturur ve degeri buraya atar, eski container yerinde kalir.
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        String a = "Money";
        //Asagidaki islem ile, a degiskeni icin yeni bir heap containeri olusturup, yeni degeri atar. Ancak eski degerin
        // Stack deki adres yolu kirilir, yeni deger o adrese atanir. Eski adresin bir yolu olmadigi icin Garbage Collector(Cöp Toplayici)
        //calisirak Stack bölgesini temizler.
        a = a + "More";

        //Mutable

        //String Builder kullanarak String üretmenin 1. yolu
        StringBuilder sb1 = new StringBuilder("Phyton");
        System.out.println(sb1);//Phyton

        sb1.append("!").append("?").append("."); //Java yeni bir container olusturmaz, ayni Heap bölümündeki yerde degeri degistirir.
        System.out.println(sb1); //Phyton!?.

        //Append : eklemek demektir.

        //String Builder kullanarak String üretmenin 2. yolu
        StringBuilder sb2 = new StringBuilder(); //Constructor'un icine ilk basta deger atanmaz
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        //StringBuilder kullandiginizda baslangic kapasitesi 16'dir.
        // Kapasite asildginda varolan kapasitenin iki fazlasi kadar varolan kapasiyete ekleme yapilir,
        //16==> 16*2+2      -       34==>34*2+2
        System.out.println(sb2.capacity());//16
        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16
        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2
        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 34*2+2

        //StringBuilder kullanarak String üretmenin 3.yolu
        StringBuilder sb3 = new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"XXXXXX");//FlXXXXXXo
        System.out.println(sb3);
    }
}
