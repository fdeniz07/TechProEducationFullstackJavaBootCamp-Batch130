package ssg.ssg26encapsulation;

public class OgretmenRunner {

    public static void main(String[] args) {

        Ogretmen ogr1 = new Ogretmen();
        ogr1.setIsim("Ahmet");
        System.out.println(ogr1.getIsim());
        //bu yontemde data hiding degil daha anlasilir bir kod amacladik

    }
}
