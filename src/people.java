public class people {
    private int yas;
    private String ad;
    private String soyad;

    public people(int yas, String ad, String soyad) {
        this.yas = yas;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
