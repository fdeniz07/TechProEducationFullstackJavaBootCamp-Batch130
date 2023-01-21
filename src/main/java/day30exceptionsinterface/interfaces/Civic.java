package day30exceptionsinterface.interfaces;

    /*
        1)Bir interface'i bir Class'in parent'i yapmak icin "implements" keyword'unu kullaniriz.
        2)Java parent'lar Class oldugunda "multiple parent"a musaade etmez ama biz bazen "multiple parent"a ihtiyac duyariz.
          Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
          Bu yapi sayesinde bir Class icin coklu interface parent olusturabiliriz.
        3)Coklu interface parent'larin herbirinin icine ayni isimli method'lar koyabiliriz.
          Mesela AC'nin, Engine'nin ve Security'nin herbir iclerine "run method"u koymak gibi.
          Child Class herhangibirisini override ettiginde hepsini Override etmis gibi olur sonra da
          body'i Child Class'da yazarak uygulamasini yapmis olur.

     */



public class Civic implements Ac,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfectly");
    }
}
