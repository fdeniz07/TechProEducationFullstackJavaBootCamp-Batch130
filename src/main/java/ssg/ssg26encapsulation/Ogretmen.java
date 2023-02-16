package ssg.ssg26encapsulation;

public class Ogretmen {
    //encapsulation sadece sinirlama icin degil yapilan isi daha iyi tanimlamak icin kullanir
    //bu yaklasimi kullanan class'larda tum variable'lar private yapilir
    //hepsi icin getter ve setter yapilir
    private String isim;
    private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    private String soyIsim;
}
