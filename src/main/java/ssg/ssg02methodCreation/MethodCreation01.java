package ssg.ssg02methodCreation;

public class MethodCreation01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*
                Java'da method nasil olusturulur?
                1)main method'un disinda olusturulur
                2)Access Modifier + Return Type + Method Ismi + () + {}
                Olusturulan method'lar nasil kullanilir?
                1)main method'un icinden kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz sayilari parantezin icine koyun
         */


        // iki variable'in degerlerini toplayan     bir  method olusturalim
        // 1.adim : method adini yazalim
        // 2.adim : method'a gondermem gereken argument var mi ?

        ikiSayiTopla(a, b);

        // stattic method
        Calcualator.Carpimi(3, 6);
        Calcualator.Bolme(12, 6);
        Calcualator cal = new Calcualator();

    }

    // bir method'u olusturmak calismasi icin yeterli degildir
    // method ancak cagrilirsa calisir
    // ayni class veya farkli class'da olmasinin hic bir onemi yoktur
    // Java main method'da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a + b));
    }

}
