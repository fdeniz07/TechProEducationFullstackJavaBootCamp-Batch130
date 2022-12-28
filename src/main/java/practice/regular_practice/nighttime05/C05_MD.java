package practice.regular_practice.nighttime05;

public class C05_MD {

    public static void main(String[] args) {

        int[][] x = {{82, 1}, {0, 70, 80}};

        System.out.println(m(x[1]));
    }//main

    public static int m(int[] m) {// {0, 70, 80}

        int result = m[1];//  {0, 70, 80};

        for (int i = 0; i < m.length; i++) {

            result += m[i];

        }

        return result;

    }
}
