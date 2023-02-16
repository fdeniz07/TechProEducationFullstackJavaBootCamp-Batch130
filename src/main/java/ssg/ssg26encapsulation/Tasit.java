package ssg.ssg26encapsulation;

public class Tasit {
    private String tasitTuru;
    private boolean muayinesiVarMi;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayinesiVarMi() {
        return muayinesiVarMi;
    }

    public void setMuayinesiVarMi(boolean muayinesiVarMi) {
        this.muayinesiVarMi = muayinesiVarMi;
    }

    public int getKacVites() {
        return kacVites;
    }

    public void setKacVites(int kacVites) {
        this.kacVites = kacVites;
    }

    private int kacVites;

}
