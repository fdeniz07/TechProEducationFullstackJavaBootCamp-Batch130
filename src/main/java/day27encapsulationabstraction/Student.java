package day27encapsulationabstraction;

/*
    OOP Principals:
    i)Inheritance +
    ii)Polymorphism: Method Overloading + Method Overriding +
    iii)Encapsulation +
    iv)Abstraction
 */



/*
     Encapsulation faydası;
1. guvenlık..saklamazsak dısardan etkıler data yı bozabılır.
2. dıkkatı dagılır..odak dagınıklıgının onune gecer

 */

public class Student {

    private String stdId = "AC123";
    private  double gpa =3.99;
    private boolean poor = true;

    //Encapsulation yapilmis datayi okuyabilirmiyiz?

    //get method'lar encapsule edilmis (saklanmis) datayi okumamiza yarar
    //get method'lar (getter) her zaman "public" olur
    //get method'lar (getter) return ytpe'i variable'in data type'i ile ayni olur
    //get method'lar (getter) isimleri get + variable name seklinde olur.
    //get method'lar (getter) isimleri variable booelan ise "is + variable name seklinde olur.
    //get method'lar (getter) parametre kullanmazlart


  public String getStdId() {
    return stdId;
  }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

    //Encapsulation yapilmis data'larin degeri degistirilebilir mi?

    //set method'lar (setter) encapsule edilmis data'larin degerini degistirmemize yarar.
    //set method'lar (setter) her zaman public olur
    //set method'lar (setter) return type her zaman void olur
    //set method'lar (setter) isimleri set + variable name seklinde olur.
    //set method'lar (setter) variable ile ayni data type'inda parametre kullanilirlar.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    //getter ve setter'larin ikisine birden "java beans" denir
}
