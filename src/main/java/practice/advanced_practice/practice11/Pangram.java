package practice.advanced_practice.practice11;

public class Pangram {

    /*
        Bir cümlenin pangram olup olamadığını kontrol eden bir kod yazınız.
        Not: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.
        TR: Pijamalı hasta yağız şoföre çabucak güvendi.
        ENG: The quick brown fox jumps over the lazy dog.
    */

    public static void main(String[] args) {

        String tr = "Pijamalı hasta yağız şoföre çabucak güvendi";
        String en = "The quick brown fox jumps over the lazy dog";

        System.out.println(isPangram(tr));
        System.out.println(isPangram2(en));
    }

    //1.Yol
    public static boolean isPangram(String str) {

        str = str.replaceAll(" ","").toLowerCase();
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";

        boolean sonuc = true;

        for (int i = 0; i < trAlfabe.length(); i++) {
            if (!str.contains(String.valueOf(trAlfabe.charAt(i)))) {
                sonuc= false;
                break;
            }
        }
        return sonuc;
    }

    //2.Yol
    public  static boolean isPangram2(String str){

        str= str.replaceAll(" ","").toLowerCase();
        for (char ch='a'; ch<='z'; ch++){

            if (str.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
