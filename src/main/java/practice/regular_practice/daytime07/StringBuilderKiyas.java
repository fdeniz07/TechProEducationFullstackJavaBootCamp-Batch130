package practice.regular_practice.daytime07;

public class StringBuilderKiyas {
    /*
     * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
     * kontrol edip StringBuilder ve String class'larinin performanslarini
     * karsilastiralim.
     * Ipucu: long TimeSb = System.nanoTime(); kullanalim
     */

    public static void main(String[] args) {

        String str ="Merhaba";

        long time1 =System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            str+=" ";
        }
        long time2 = System.nanoTime();
        long stringSure = time2-time1;
        System.out.println("stringSure = " + stringSure);

        ////////////////// ************************* \\\\\\\\\\\\\\\\\\\\\\
        StringBuilder sb = new StringBuilder("Merhaba");
        long time3 =System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            sb=sb.append(" ");
        }
        long time4 =System.nanoTime();
        long stringBuilderSure = time4-time3;
        System.out.println("stringBuilderSure = " + stringBuilderSure);

        if(stringBuilderSure>stringSure){
            System.out.println("String Builder daha yavas calisti");
        }else if(stringBuilderSure<stringSure){
            System.out.println("String daha yavas calisti");
        }else
            System.out.println("Her ikiside esit surede calisti");
    }
}
