package ssg.ssg26encapsulation;

public class ArabaRunner {

    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ina
        //ulasabildim, degisterebildim ve cagrabildim
        arb1.marka="Toyota";
        System.out.println(arb1.marka);
        //acces modifier kullanarak marka variable'ina ulsabildim
        //tamamen serbest yapabilir ya da tamamen engelleyebilir
        //yani acces modifier ya hep ya hic diyor

        //model'i degistirelim ama gormeyelim
        //yakit turunu gorelim ama degistiremeyelim

        arb1.setModel("Corolla");//model olarak Corrolla'yi atadir
        //model'i yazdirma imkaniz cunku getter methodumuz yok
        System.out.println(arb1.getYakit());//Dizel bilgisini yazdirabildik
        //yakit turunu degistirme imkanimiz yok cunku setter method'u yok

        //ilk olarak variable'imizi private yapmamiz gerekiyor
        //private variable'lara baska classlardan ulasmak mumkun olmadıgından
        //ikinici olarak set yetkisi icin setter,get yetkisi icin getter methodlari olusturulur
    }
}
