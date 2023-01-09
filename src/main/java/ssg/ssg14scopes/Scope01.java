package ssg.ssg14scopes;

public class Scope01 {
    protected int yas = 15;// instance variable
    static String okulIsmi = "yildiz Kolej";

    //    There 3 types of variable
    //  1) instance variable
    //  2)local variable
    //  3)static Variable
    //
    //    instance variable ve  local variable arasindaki fark ne dir ?
    //
    //            1)  instance variable class icinde tanimlir  local variable ise method icinde tanimlanir.
    //            2) instance variable ilk degieri koymazsaniz olur hata vermez sonra koyabilir siniz ama Local varibale ilk degri atmaniz lazim.
    //

    public static void main(String[] args) {
        int y = 20;
        y = 15;

        {
            int z = 16;
            System.out.println(y);
        }
        //  System.out.println(z);
        String name;
        {

            name = "victor";
        }
        System.out.println(y);
    }

    public static void print() {

        // System.out.println(y);
        int x = 15;
        System.out.println(x);
        System.out.println(okulIsmi);
    }
}
