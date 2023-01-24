package practice.advanced_practice.practice11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextOkumaYazma {

    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:/Users/PRODOC/Desktop/TextOkumaYazma.txt");
        BufferedReader br = new BufferedReader(fr);
        String satir = br.readLine();

        String yeniDosya = "";
        //System.out.println(" br.readLine() = " + br.readLine());

        while (satir != null) {
            //System.out.println("satir = " + satir);
            yeniDosya += satir + "==> Satir kelime sayisi: " + satir.split(" ").length + "\n";
            satir = br.readLine();

        }

        System.out.println("yeniDOsya = " + yeniDosya);
        br.close();

        FileWriter writer = new FileWriter("C:/Users/PRODOC/Desktop/TextOkumaYazma.txt");
        writer.write(yeniDosya);
        writer.close();
    }
}
