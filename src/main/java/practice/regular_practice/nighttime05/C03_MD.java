package practice.regular_practice.nighttime05;

public class C03_MD {

    public static void main(String[] args) {
        String arr[][] = {{"Eser"}, {"Kenan", "Oya", "Gulsen"}, {"Yeliz", "Selim"}};
        System.out.println(m(arr));
    }//main

    public static String m(String[][] arr) {

        int r, c;   //  String arr[][] = [["Ali", "Eser"], ["Kenan", "Oya", "Gulsen"], ["Yeliz", "Selim"]]

        String i, k = "";

        for (r = 0; r < arr.length; r++) {

            for (c = 0; c < arr[0].length; c++) {
                i = arr[r][c];

                if (i.length() > k.length())

                    k = i;
            }
        }
        return k;
    }
}
