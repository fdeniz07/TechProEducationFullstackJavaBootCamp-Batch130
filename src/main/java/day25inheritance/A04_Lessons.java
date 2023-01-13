package day25inheritance;

public class A04_Lessons {
    public void liveSessions( ){
        System.out.println("Online Dersler");
    }//method

    public A04_Lessons() {
        System.out.println("salih bey icin calisti");
    }//default bos const

    public A04_Lessons(String level){
        this();
        System.out.println("Derslerin seviyesi olur");
    }//parametreli const.
}
