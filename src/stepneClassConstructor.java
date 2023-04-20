package firtina;

public class stepneClassConstructor {

    public int yas = 34;
    public String isim = "yusuf";

    public static int topla(int a, int b) {

        return a + b;
    }

    public stepneClassConstructor() {
        System.out.println("stepneClass sınıfı tarafından bir nesne oluşturuldu");
    }

    public stepneClassConstructor(String yeniIsim, int yeniYas) {
        isim = yeniIsim;
        yas = yeniYas;
    }

    public stepneClassConstructor(String isim) {
        this.isim = isim;
    }

    public String yaz() {
        return isim + " " + yas;
    }

}
