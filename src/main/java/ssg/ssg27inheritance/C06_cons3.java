package ssg.ssg27inheritance;

public class C06_cons3 extends C05_cons2 {

    String str="gul";
    C06_cons3(int b){
        System.out.println("C06 daki cons calisti");

    }
    C06_cons3(String a){
        this(2);
        System.out.println("C06Daki parametreli cons calisti");
    }

    public static void main(String[] args) {
        //List<String> list=new ArrayList<>();
        C04_cons1 obj=new C06_cons3("a");
        obj.ekleme();
        System.out.println(obj.str);

    }

    @Override
    void ekleme() {

    }
}
