package day20passbyvaluemethodoverloading;

public class C02_PassByValue {

    /*

        Gomlek            = 100 TL
        Ogrenci           = -10 TL indirim =90 TL
        Gazi              = -20 TL indirim =80 TL
        Yaslilara         = -5  tL indirim =95 TL

       */

    public static void main(String[] args) {
        int gomlek=100;

        System.out.println(indirim("ogrenci", gomlek));//90
        System.out.println(indirim("Gazi", gomlek));//80
        System.out.println(indirim("Yaslilar", gomlek));//95

        String kutlama="Wooow";
        System.out.println("kutlama = " + kutlama);
       /* kutlamaUnlemIle(kutlama);
        System.out.println(" unlem eklendikten sonra kutlama = " + kutlama);*/
        kutlama=  kutlamaUnlemIle(kutlama);
        System.out.println("methodan sonra atama yapilinca main icinde kutlama = " + kutlama);// Wooow!

    }

    private static String kutlamaUnlemIle(String kutlama) {
        String unlemliKutlama=kutlama+"!";
        System.out.println("method icinde kutlama = " + unlemliKutlama);
        return unlemliKutlama;
    }

    private static int indirim(String durum, int gomlek) {
        switch(durum){
            case "ogrenci":
                gomlek=gomlek-10;
                break;
            case "Gazi":
                gomlek=gomlek-20;
                break;
            case"Yaslilar":
                gomlek=gomlek-5;
            default:
                gomlek=gomlek;
        }
        return gomlek;

    }
}
