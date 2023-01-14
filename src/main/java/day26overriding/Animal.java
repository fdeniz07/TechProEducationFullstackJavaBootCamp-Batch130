package day26overriding;


/*
  1)Parent Class'da ki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.

  2)Overriding'de method'un parantezine,method'un ismine dokunulmaz, method'un body'si degistirilir.

  3)@Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.

  4)Overriding'de Parent Class'daki method'a "Overridden Method" denir, Child Class'daki method'a ise "Overriding Method" denir.

  5)"private" method'lar "override" edilemezler.

  6)Child Class'daki override edilmis method(Overriding Method)'un access modifier'i Parent Class'daki override
  edilmis method(Overridden Method)'un access modifier'indan dar olamaz.
    Overriden Method==>protected ise Overriding method ==> protected +public
    Overriden Method==>default ise Overriding method ==> default +protected+ public
    Overriden Method==>private ise Overriding method ==> override olmaz ki acces modifier olsun. bkz 5. kural

  7)Child class'da override edilen method'un(Overriding Method) return typ'i methodu'un return ettigi data type'inin aynisi veya o data type'inin parent'i olarak secilir.

  8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez. Cunku return type ya
    ayni olur ya da parent'dan secilir ama primitive'ler arasinda parent-child iliskisi olmadigindan parent'dan secmek
    mevzu olamaz. O zaman tek secenek aynisi olmalidir kalir.

  9)Method'un return type'i "Wrapper Class" ise Overriding yaparken return type degidtirilmez.Cunku; return type ya
    ayni olur ya da parent'dan secilir. Ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent''dan
    secme ihtimali yoktur,geriye sadece aynisi olma ihtimali kalir.

  10)Method'un return type'i "void" ise Overriding yaparken return type degistirilemez.

 */

public class Animal {

    public void eat() {
        System.out.println("Animals eat..."); //Parent'daki override edilmis eat() method'una "Overriding Method" denir-
    }

    public void drink() {
        System.out.println("Animals drink...");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }
}
