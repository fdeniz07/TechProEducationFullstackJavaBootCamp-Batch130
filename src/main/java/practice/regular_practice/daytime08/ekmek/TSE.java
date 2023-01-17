package practice.regular_practice.daytime08.ekmek;

public abstract  class TSE {
    String malzeme="Undan yapilir";
    abstract void gramaj500();//childlari uymak zorunda
    abstract  void hijyenikOlma();

    void odunAtesindePiser(){
        System.out.println("TSE ekmekler odun atesinde piser");
    }
    void fiyat(){
        System.out.println("15 TL");
    }
}
