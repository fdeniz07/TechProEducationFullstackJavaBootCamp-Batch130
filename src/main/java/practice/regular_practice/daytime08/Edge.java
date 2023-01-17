package practice.regular_practice.daytime08;

public class Edge extends  Browser {
    String adresCubugu;// null

    public Edge() {

    }

    public Edge(String adresCubugu) {
        this.adresCubugu = adresCubugu;
    }

    @Override
    public void search(){
        System.out.println("Edge aratma yapar");
    }
    @Override
    public void sifreKaydetme(){
        System.out.println("Edge istenildiginde sifre kaydeder");
    }
}
