package ssg.ssg05stringmanipulations;

public class StringManipulation07 {
    /*
      Soru 7: girilen Stringdeki tum rakamları "*" ile degistirin
    */
    public static void main(String[] args) {
        String str = "bu4ak1";
        String a = str.replaceAll("[0-9]", "*");
        System.out.println(a);
    }
}
