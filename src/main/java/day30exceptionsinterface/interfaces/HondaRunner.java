package day30exceptionsinterface.interfaces;

public class HondaRunner {

    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();
        System.out.println(Ac.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);

        System.out.println(Ac.model);

        Accord myAccord = new Accord();
        myAccord.cool();

    }
}
