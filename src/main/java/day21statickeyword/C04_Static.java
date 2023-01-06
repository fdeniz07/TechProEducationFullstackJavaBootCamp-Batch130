package day21statickeyword;

public class C04_Static {

    public static void main(String[] args) {
        System.out.println(C03_StaticDepo.okulIsmi);//Emre Okullari

        C03_StaticDepo obj1 = new C03_StaticDepo();

        System.out.println(obj1.ogrenciGul);//Gul Gecer

        C03_StaticDepo.okulIsmi = " Mine Okullari";
        System.out.println("C03_StaticDepo.okulIsmi = " + C03_StaticDepo.okulIsmi);//Mine Okullari

        C03_StaticDepo obj2 = new C03_StaticDepo();
        obj2.ogrenciGul = "Zeynep Karagol";
        System.out.println("obj2den ogrenci " + obj2.ogrenciGul);// Zeynep Karagol
        System.out.println("obj1den ogrenci " + obj1.ogrenciGul);//Gul Gecer

        System.out.println(obj2.okulIsmi);// Mine Okullari
        // static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        //static variable'lara class ismi kullanarak ulasilmalidir
    }
}
