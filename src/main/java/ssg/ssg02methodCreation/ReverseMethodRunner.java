package ssg.ssg02methodCreation;

import java.util.Scanner;

public class ReverseMethodRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("4 harfli bir String yaziniz");
        String str2=input.next();

        System.out.println("3 harfli bir String yaziniz");
        String str=input.next();

        StringReverseMethod.dortHarfiTersineCevir(str2);
        StringReverseMethod.ucHarfiTersineCevir(str);

        StringReverseMethod.dortHarfiTersineCevir("java");
        StringReverseMethod.ucHarfiTersineCevir("ali");

    }
}
