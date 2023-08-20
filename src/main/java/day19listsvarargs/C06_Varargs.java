package day19listsvarargs;

public class C06_Varargs {
    public static void main(String[] args) {

        /*

        Farkli parametreler ile calisabilen methodlar olusturmak icin varargs'lar kullanilir
        Varargs'larin arka tarafinda Array'ler calisir
        Varargs nasil olusturulur.( Data type...  varargs ismi) veya ( Data type  ...varargs ismi)
        Varargs en sonda olmak sartiyla  bir method olustururken farkli data type'lari kullanilabilir****
        Varargs 'lar bir methodda birden fazla kullanilamaz == unreachable code olur
         */

        ikiSayiyiTopla(2, 3);
        ucSayiyiTopla(6, 8, 14);
        dortSayiyiTopla(56, 96, 40, 30);

    }

    private static int dortSayiyiTopla(int i, int i1, int i2, int i3) {

        return i + i1 + i2 + i3;
    }

    private static int ucSayiyiTopla(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    private static int ikiSayiyiTopla(int i, int i1) {
        return i + i1;
    }

    private static int add( String str,int... a) {
        int sum = 0;  //  int... a,String str unreachable code == ulasilamaz kod
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }


}

