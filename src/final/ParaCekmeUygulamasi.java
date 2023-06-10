package firtina;

public class ParaCekmeUygulamasi extends Thread implements Runnable {
    private static double bakiye = 1000;
    private double cekilecekMiktar;

    public ParaCekmeUygulamasi(double cekilecekMiktar) {
        this.cekilecekMiktar = cekilecekMiktar;
    }

    public synchronized void paraCek() {
        if (cekilecekMiktar <= bakiye) {
            bakiye -= cekilecekMiktar;
            System.out.println(Thread.currentThread().getName() + " tarafından " + cekilecekMiktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
        } else {
            System.out.println(Thread.currentThread().getName() + " tarafından " + cekilecekMiktar + " TL çekilemedi. Yetersiz bakiye: " + bakiye + " TL");
        }
    }

    @Override
    public void run() {
        paraCek();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParaCekmeUygulamasi(200));
        Thread thread2 = new Thread(new ParaCekmeUygulamasi(300));
        Thread thread3 = new Thread(new ParaCekmeUygulamasi(400));
        Thread thread4 = new Thread(new ParaCekmeUygulamasi(500));
        thread1.setName("1 seyit ilham");
        thread2.setName("2 halil ibrahim");
        thread3.setName("3 abdulhakim");
        thread4.setName("4 hatice");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


}
