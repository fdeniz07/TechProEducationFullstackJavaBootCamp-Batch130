package day29exceptions;

public class Exception02 {

/*
      "throw" ile "throws" keyword'leri arasindaki fark nedir?
      1)"throw" method body'si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
      2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir.
         "throws" ise method parantezinden hemen sonra sadece bir kere kullanilabilir.
      3)"throw" dan sonra "new" keyword ve constructor kullanilarak object olusturulur.
        "throws" dan sonra sadece "Exception Class" ismi yazilir.
      4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra
         durdurur.
 */


    public static void main(String[] args) throws IllegalArgumentException {

        try {
            printAge(-35);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

//        try {
//            getMark(-25);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        getMark(-90);
    }

    //throw keyword bir method'un body'si içinde istediğimiz yerde istediğimiz koşullar icin,istedigimiu kadar Exception atmamızı sağlar.
    //throw keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    //Exception class constructor'inin parantezi icine istediginiz Exception Mesajini yazabilirsiniz.
    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }

    //Ögrenci Notlari girisi yapan ve notu console'a yazdiran bir metot olsuturun.
    public static void getMark(double d) {

        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        } else {
            System.out.println(d);
        }
    }


}
