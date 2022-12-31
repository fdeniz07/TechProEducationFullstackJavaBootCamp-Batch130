package ssg.ssg02methodCreation;

public class SchoolRunner {

    public static void main(String[] args) {

        MethodCreation02.hosgeldinizSsgDersleri();
        School okul = new School();

        System.out.println(okul.okulIsmi);
        System.out.println(okul.yil);
        System.out.println(okul.isActive);
        // to string method
        //System.out.println(okul);

        School.okulIsmiYazdir("Bahar Okulu");
        School.yilyazdir(2023);
        System.out.println(okul.isActiveMi(true));


    }
}
