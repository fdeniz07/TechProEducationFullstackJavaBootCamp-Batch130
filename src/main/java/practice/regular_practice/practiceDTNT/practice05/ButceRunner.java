package practice.regular_practice.practiceDTNT.practice05;

public class ButceRunner {
    public static void main(String[] args) {
        Butce baba = new Butce();
        System.out.println("Maas oncesi butce : " + Butce.butce);//0
        baba.maasAl(3000);
        System.out.println("Maas sonrasi butce : " + Butce.butce);//3000
        baba.harclikAl(100);
        baba.harclikHarca(20);
        baba.butcedenHarca(500);
        System.out.println(baba.harclik);//80
        System.out.println(Butce.butce);//2400

        Butce anne = new Butce();
        anne.maasAl(5000);
        anne.harclikAl(500);
        anne.harclikHarca(450);
        System.out.println(Butce.butce);//6900
        System.out.println(anne.harclik);//50

        Butce oglan = new Butce();
        oglan.harclikAl(100);
        oglan.harclikHarca(150);
        System.out.println(Butce.butce);//6800
        System.out.println(oglan.harclik);//70

    }
}
