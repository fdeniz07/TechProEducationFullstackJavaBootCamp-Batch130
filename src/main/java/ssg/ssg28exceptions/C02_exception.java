package ssg.ssg28exceptions;

import java.util.Scanner;

public class C02_exception {

    private int sayi;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi1 = scan.nextInt();
        C02_exception obj1 = new C02_exception();
        obj1.ageControl(sayi1);
    }

    private void ageControl(int sayi) throws AgeFalse {
        //AgeFalse obj1=new AgeFalse(15);
        if (sayi < 18) {
            throw new AgeFalse("lutfen 18 yasindan buyuk bir sayi al yoksa disari cikamazsin");

        } else System.out.println("istediginiz gibi cikabilirsiniz");

    }
}

