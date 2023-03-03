package ssg.ssg30exceptions;

import java.util.Scanner;

public class C03_exception {
    public static void main(String[] args) throws AgeException {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        C02_exception.chechAge(yas);

    }
}
