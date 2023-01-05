package practice.regular_practice.practiceDTNT.practice04;

public class ForLoop {
    // Baslangic ve bitis sayilari arasindaki artis miktarinca artirilarak
    // verilen tum sayilari aralarina virgul koyarak yazdirin
    // int baslangic=10;
    // int bitis=50;
    // int artisMiktari=5;

    public static void main(String[] args) {
        int baslangic=10;
        int bitis=50;
        int artisMiktari=5;

        for (int i = baslangic; i <= bitis ; i+=artisMiktari) {
            if(i<bitis){
                System.out.print(i+ ",");
            }else {
                System.out.println(i);
            }
        }
    }
}
