package ssg.ssg07ifstatementternary1;

public class IfStatements01 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;


        if (a == b) {

            System.out.println("verilen sayilar esit");

        }

        if (a > 100) {
            System.out.println("a yuzden buyuk");
        }

        if (a * b > 1) {
            System.out.println("sayilarin carpimi 5 ten buyuk");
        }
        // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklidir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        //  hicbirisinin body'si calismayada bilir

    }
}
