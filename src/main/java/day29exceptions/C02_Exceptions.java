package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_Exceptions {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day29exceptions/TaskExceptions");
            fis.skip(45); //45 byte'lik data atlanildi
            System.out.println("45 baytlik data atlanildi");
            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }
        } catch (Exception e) {
            System.err.println("Dosya yolu yanlis ya da Dosya silinmis : " + e.getMessage());
        }
        System.out.println("Durmak Yok Yola devam");
    }
}
