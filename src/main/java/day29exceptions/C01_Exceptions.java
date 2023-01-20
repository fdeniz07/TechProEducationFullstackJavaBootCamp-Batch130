package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exceptions {
    public static void main(String[] args) throws IOException {
        /*
        6 )  FileNotFoundExceptions
        7 ) IOExceptions

        Javada bir Dataya ulasmak istedigimizde kullaniriz.
        Bir obje olustururuz.Cesitli methodlari vardir.
         read() ==> Tas'teki Datalari okuyor ve getiriyor.Okuyacak hic bir data kalmadiginda -1 donduruyor
         skip () ==> belirli bir kismi atlayip kalan datalari dondurur
         available () ==> Task'te kac byte'lik data oldugunu size gosterir
         */

        FileInputStream fis = new  FileInputStream ("src/main/java/day29exceptions/TaskExceptions");

        int i;

        try {
            while((i = fis.read()) != -1 ){
                System.out.print((char)i);

            }
        } catch (FileNotFoundException e) {
            System.err.println("Dosya yolu yanlis ya da Dosya silinmis : "+e.getMessage());

        }catch (IOException e) {
            System.err.println("Dosya okurken problem olustu : "+e.getMessage());
        }
        System.out.println("Durmak Yok Yola devam");
    }
}
