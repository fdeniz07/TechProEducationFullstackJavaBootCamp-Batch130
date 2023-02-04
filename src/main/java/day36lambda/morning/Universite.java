package day36lambda.morning;

public class Universite {
    private String university;
    private String bolum;
    private int ogrenciSayisi;
    private int notOrtalamasi;

    public Universite() {//parametresiz const
    }

    public Universite(String university, String bolum, int ogrenciSayisi, int notOrtalamasi) {
        this.university = university;
        this.bolum = bolum;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "university='" + university + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
}
