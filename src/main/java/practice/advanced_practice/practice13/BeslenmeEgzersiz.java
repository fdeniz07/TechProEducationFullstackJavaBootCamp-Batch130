package practice.advanced_practice.practice13;

public enum BeslenmeEgzersiz {

    Ocak("Havuc", "Nar", 17),
    Subat("Lahana", "Ayva", 16),
    Mart("Roka", "Muz", 20),
    Nisan("Enginar", "Cagla", 22),
    Mayis("Patlican", "Erik", 23),
    Haziran("Domates", "Kayisi", 27),
    Temmuz("Misir", "Karpuz", 30),
    Agustos("Borulce", "Incir", 29),
    Eylul("Mantar", "Uzum", 26),
    Ekim("Lahana", "Armut", 24),
    Kasim("Karnabahar", "Hurma", 21),
    Aralik("Pirasa", "Portakal", 19);

    final String ayinSebzesi;
    final String ayinMeyvesi;
    final int toplamEgzersizSaati;

    BeslenmeEgzersiz(String ayinSebzesi, String ayinMeyvesi, int toplamEgzersizSaati) {
        this.ayinSebzesi = ayinSebzesi;
        this.ayinMeyvesi = ayinMeyvesi;
        this.toplamEgzersizSaati = toplamEgzersizSaati;
    }

//    @Override
//    public String toString() {
//        return "BeslenmeEgzersiz{" +
//                "ayinSebzesi='" + ayinSebzesi + '\'' +
//                ", ayinMeyvesi='" + ayinMeyvesi + '\'' +
//                ", toplamEgzersizSaati=" + toplamEgzersizSaati +
//                '}';
//    }
}
