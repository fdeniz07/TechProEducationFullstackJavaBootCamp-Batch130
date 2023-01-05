package practice.regular_practice.nighttime06;

public class WhileLoopDoWhileLoop {
    //Ne zaman While Loop Ne zaman Do While Loop
    public static void main(String[] args) {

        //0'dan baslayip 6'ya kadar birer birer artan kodu yaziniz  Hangi Loop Tercih Edilmeli
        int i = 0;

        while (i < 5) { // 0 1 2 3 4 0'da başladı kontrol etmeye. Başa dönüp dönüp 5'e gelene kadar
            // kontrol etti(5 hariç)
            System.out.print(i + " "); // 6 kere kontrol çalışmış oluyor.
            // 1 kere fazladan kontrol etmiş oluyor aslında
            // biz görmesek de...
            i++;
        }
        // while loop önce kontrol eder sonra kodu çalıştırır.
        // loop içnde artış yapılsa da bir sonraki kontrole kadar kod çalışmaya devam
        // eder.
        // bu da bazı durumlarda hatalı sonuçlara ulaşmamıza sebep olabilir.

        System.out.println(" ");

        // do-while loop ise önce işlemi yapar ve sonra şartı kontrol eder.
        // özellikle kullanıcıdan deger almalarda do-while loop tercih edilir.

        int b = 0;
        do {
            System.out.println(b + " "); // 0 1 2 3 4
            b++; // 1 2 3 4 5 -- 5 geldiginde aşagıya baktı ve yukarıya kodu çalıştırmaya
            // gitmedi.
        } while (b < 5); // kontrol 5 defa çalışmış oldu. whilea göre 1 az çalıştı
    }
}
