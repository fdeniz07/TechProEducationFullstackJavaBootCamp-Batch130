package ssg.ssg01variablesdatatypes;

public class DataType01 {

    public static void main(String[] args) {

        // Java calismaya main method'dan baslar
        // sonra yukaridan asagi, soldan saga dogru calisir
        // eger istersek bir variable'i once declare edip sonra deger atayabiliriz
        String okulIsmi;
        // Java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        // ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez
        // System.out.println(okulIsmi);
        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi); // Yildiz Koleji
        okulIsmi="Star Koleji";
        System.out.println(okulIsmi); // Star Koleji

        okulIsmi="Java Koleji";

        // println ile print arasindaki fark
        // println dediginizde yazdirma isleminden sonra alt satira gecerken
        // sadece print dedigimizde yazdirma isleminden sonra alt satira gecmez
        System.out.print(okulIsmi); //Java Koleji
        System.out.print(okulIsmi);

        //primitive data types:boolean,char ,byte,short,int,long,float,double
        // 1)boolean has 2 values which are true and false. a boolean variables just use a bit in memory
        boolean isRetired = true;
        boolean isOld= false;

        //2) char is for just a single character it uses 16 bit(2 byte) in memory.
        char ch='A';
        //3) byte is for a whole number between -128 amd 127; it uses 8 bit(byte) in memory
        // less memory make good performance;
        byte age= 14;
        byte mathGrade = 76;
        //4) short :short is used for whole numbers between -32768 and 32768 it uses 16 bits (2 byte);
        short numberOfStudentsInASchool =2134;
        //5) int :int is for whole number between -2,147,483,648 and -2,147,483,648  it use 32 bit (4 byte); in memory
        int anuualProfite  = 20000000;
        //6) long: long is foe whole number between -9,223,372,06,854,808 nad 9,223,372,06,854,808 64 bit(8 byte) in memory
        //not forget L the end vale in long date type;
        long poulutionOfTheWolrd= 2000000000l;
        //7) flaot: flaot is foe whole number between -9,223,372,06,854,808 nad 9,223,372,06,854,808 32 bit(4 byte) in memory
        //not forget "f" the end vale in long date type;
        //8) double

        //no-primitive data types:strings
        String s="Hafasa";

        System.out.println( s.toUpperCase());//Upercase :HAFASA
        System.out.println(s.toLowerCase());//lowercase :hafasa

    }
}
