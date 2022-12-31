package ssg.ssg02methodCreation;

public class School {
    String okulIsmi = "Yildiz kolej";
    boolean isActive = true;
    int yil = 2022;


    public static void okulIsmiYazdir(String okulIsmi) {
        System.out.println(okulIsmi);
    }

    public static void yilyazdir(int yil) {
        System.out.println(yil);
    }

    public boolean isActiveMi(boolean isActive) {
        return isActive;
    }


    @Override
    public String toString() {
        return "{" +
                "okulIsmi='" + okulIsmi + '\'' +
                ", isActive=" + isActive +
                ", yil=" + yil +
                '}';
    }
}
