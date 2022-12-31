package ssg.ssg08ifelsenestedif;

public class IfElse {
    public static void main(String[] args) {


        //Gündüz dersimiz varsa katılabilirim

        //Gece sınıfımız varsa ona da  katılabilirim


        boolean dt = false; //  available
        boolean nt = true; // Not available

        //true || true   => true

        //false || true  => true

        //true || false  => true

        //false  || false => false
        //boolean isAvilable = dt||nt;

        if (dt || nt) {
            System.out.println("sınıfa katılabilirim");
        } else {
            System.out.println("sınıfa katılamıyorum");
        }
    }
}
