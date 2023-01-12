package day24accessmodifiersinheritance;

public class Student {

    /*
        Access Modifier
        1)public     2)protected
        3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)
        yazarsan kizar
        4)private
        Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private
        Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz
              ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler
        Note: "protected" ile "default" un farkini soyleyiniz.
              protected olanlar baska package'lerden kullanilamaz ancak
              baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz
     */
    // public her class'dan kullanilabilir
    public String stdName ="Ebubekir Can";
    //protected olanlar baska package'dan sadece child class'lardan gorulur
    protected String address="Istanbul";
    //default olanlar baska package'den
    // kullanilamazlar  isyeri mail'i
    String email="ebcan@gmail.com";
    //private olanlar sadece olsturulduklari
    // Class icinde kullanilabilirler  TC NO
    private  String tcNo="31568746";
}
