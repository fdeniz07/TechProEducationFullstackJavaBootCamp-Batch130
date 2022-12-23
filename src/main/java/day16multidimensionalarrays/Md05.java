package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz


        int[][] a = {{5, 10}, {2, 6, 7}};

        int carpim =1;

        for (int[] w : a) { //int[] a multi-dimensional array icerisinde elemanlarin türü bir array oldugu icin belirtiyoruz

            for (int k : w) { //burada ise w nin icerisindeki elemanlari array e ekliyoruz. Yani [] kullanmiyoruz
                carpim *=k;
            }

        }
        System.out.println(carpim);
    }
}
