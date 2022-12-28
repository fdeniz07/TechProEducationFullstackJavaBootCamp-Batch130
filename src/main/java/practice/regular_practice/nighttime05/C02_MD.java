package practice.regular_practice.nighttime05;

public class C02_MD {

    public static void main(String[] args) {

        int[][] x = {{-9, 0}, {0, 0, 49}};

        System.out.println(m(x));
    }

    public static int m(int[][] m) {
        int result = m[1].length;     //{{-9, 0}, {0, 0, 49}};

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                result += m[i][j];

            }
        }
        return result;
    }

}
