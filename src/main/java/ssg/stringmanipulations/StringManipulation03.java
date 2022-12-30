package ssg.stringmanipulations;

public class StringManipulation03 {
    /*
        Soru 3)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
      "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
       iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
     */

    public static void main(String[] args) {

        String str = "Java BUYUK dunya kucucuk";
        str = str.toLowerCase();
        if ((str.contains("buyuk")) && (str.contains("kucuk"))) {
            System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");
        } else if (str.contains("kucuk")) {
            System.out.println(str.toLowerCase());

        } else if (str.contains("buyuk")) {
            System.out.println(str.toUpperCase());

        } else
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
    }
}
