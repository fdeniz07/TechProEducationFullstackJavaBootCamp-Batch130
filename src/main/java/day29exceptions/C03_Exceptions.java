package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        // available()== kullanilabilir byte sayisini bize verir
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/day29exceptions/TaskExceptions");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("kullanilabilir byte sayisini bize verir " + fis.available());//6224
        //Dosyadan 3 byte'lik data okudu
        fis.read();
        fis.read();
        fis.read();
        System.out.println("kullanilabilir byte sayisi " + fis.available());//6221


    }
}
