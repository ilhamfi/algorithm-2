package firtina;

public class people {
    private int yas;
    private String ad;
    private String soyad;

    public people(int yas, String ad, String soyad) {
        this.yas = yas;
        this.ad = ad;
        this.soyad = soyad;
    }
    public people() {
        this.yas = 0;
        this.ad = " null";
        this.soyad = " null";
    }

    public int getAge() {
        return yas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setAge(int yas) {
        this.yas = yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSurname(String soyad) {
        this.soyad = soyad;
    }

    public void printInfo(){

        System.out.println(yas+ad+soyad);
    }
}
