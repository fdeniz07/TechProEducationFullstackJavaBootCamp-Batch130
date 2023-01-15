package day27encapsulationabstraction;

/*
    OOP Principals:
    i)Inheritance +
    ii)Polymorphism: Method Overloading + Method Overriding +
    iii)Encapsulation +
    iv)Abstraction
 */


public abstract class Courses {

/*
   Bir method "parent class" da "abstract method" ise;
   Child Class o method'u "override" edip kullanmak zorundadir.
   Bu yuzden her hangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method'u "abstract" yapmalisiniz.


   1)Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
     Body'si olmayan method'lara "abstract method" lar denir.

   2)"abstract method" lar child class'lar tarafindan "override" edilmek zorundadirlar.
      Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
      o method'u abstract yapmak gerekir.

    3)Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
      "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

    4)"abstract method" lar siradan class'larin(concrete) icine yazilamazlar, "abstract method" larin icine yazildiklari class'lar da
      abstract olmak zorundadirlar.

    5)"abstract class"larda hem abstract method'lar hem de concrete method'lar kullanilabilir.

    6)"Concrete Class"lar "abstract class"larin child'i olabilirler.
       "abstract method"larin override edilme zorunlulugu "concrete class"lar icindir.

    7)
*/

    public abstract void math();

    public void art(){
        System.out.println("Printing...");
    }

    //final method'lar "override" edilemezler, halbuki "abstract" emthod'lar override edilmek icin olusturulurlar.
    //Bu celiskidir, bu yüzden Java abstract method'larin final olmasina müsaade etmez.
    //public final abstract void science();

    //Concrete Class'lar final oldugunda Child Class'a sahip olmazalar
    //Ama "Abstract Class"lar icin Child Class olmalidir, cünkü Child Class'lar abstract parent class'daki abstract method'lari kullanirlar.
    //Bu yüzden, Java "Abstract Class" larin "final" olmasina müsaade etmez.

    //"abstract method"lar "private" olamazlar, cünkü Child Class'lar abstract method'lari kullanirlar, private yapinca kullanima kapali olurlar.
    //Bu celiskidir bu yuzden Java "abstract method"larin "private" olmasina musaade etmez.

    //"abstract method"lar "static" olmazlar cünkü "static method"lar override edilemezler. Halbuki "abstract method"lar override edilmek icin olusturulmustur.

}
