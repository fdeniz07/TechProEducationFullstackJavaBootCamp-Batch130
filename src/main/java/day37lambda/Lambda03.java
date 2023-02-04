package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz
        boolean result1 = coursesList.
                                        stream().
                                        allMatch(t -> t.getAverageScore() > 91);
        System.out.println("result1 = " + result1);


        //2)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result2 = coursesList.
                                        stream().
                                        anyMatch(t -> t.getCourseName().
                                                contains("Turkish"));
        System.out.println("result2 = " + result2);

        //3)Average score'u en yuksek olan kursun ismini console'a yazdiran kodu yaziniz.
        //1.Yol
        String name1 = coursesList.
                                    stream().
                                    sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                                    findFirst().
                                    get().
                                    getCourseName();
        System.out.println("name1 = " + name1);


        //2.Yol
        String name2 = coursesList.
                                    stream().max(Comparator.comparing(Course::getAverageScore)).
                                    get().
                                    getCourseName();
        System.out.println("name2 = " + name2);


        //4)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console'a yazdiriniz.
        List<Course> courseList1  = coursesList.
                                                stream().
                                                sorted(Comparator.comparing(Course::getAverageScore)).
                                                skip(2).
                                                collect(Collectors.toList());
        System.out.println("courseList1 = " + courseList1);

        //5)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ucunu liste halinde console'a yazdiriniz.
        List<Course> yourList = coursesList.
                                            stream().
                                            sorted(Comparator.comparing(Course::getAverageScore)).
                                            limit(3).
                                            collect(Collectors.toList());
        System.out.println("yourList = " + yourList);


        //6)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ucuncuyu console'a yazdiriniz.

        Course result5 = coursesList.
                                        stream().
                                        sorted(Comparator.comparing(Course::getAverageScore)).
                                        skip(2).limit(1).
                                        findFirst().
                                        get();
        System.out.println("result5 = " + result5);
    }
}
