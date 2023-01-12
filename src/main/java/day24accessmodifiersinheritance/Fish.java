package day24accessmodifiersinheritance;

public class Fish {

    public int gram=10;
    public String renk ="Gri";
    public void eat(){
        System.out.println("Baliklar yosun yer");
    }
    public Fish(int gram) {
        this.gram = gram;
    }
    public Fish() {
        System.out.println("Baliklar yuzer");
    }
    public Fish(int gram, String renk) {
        this.gram = gram;
        this.renk = renk;
    }
    @Override
    public String toString() {
        return "Fish{" +
                "gram=" + gram +
                ", renk='" + renk + '\'' +
                '}';

    }
}