package ssg.varargs;

public class Varargs01 {
    public static void main(String[] args) {

        // bir den fazla sayilerin toplyan bir method olsutrun .
        sayiTopla(3);
        sayiTopla(4,5);
        sayiTopla(6,7,8);
        sayiTopla(2,3,4,5,6,7,8,9);

    }


    public static void sayiTopla(int ... b){
        int sum = 0;
        for (int w:b){
            sum+=w;// sum=sum+w
        }
        System.out.println("sayilarin toplami : "+ sum);
    }
}
