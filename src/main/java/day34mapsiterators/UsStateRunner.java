package day34mapsiterators;

public class UsStateRunner {

    public static void main(String[] args) {

       String arizonaAbbr=  UsStates.ARIZONA.getAbbreviation();
        System.out.println(arizonaAbbr); //AZ

        UsStates arizona=  UsStates.ARIZONA;
        System.out.println(arizona); //ARIZONA
    }
}
