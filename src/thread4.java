package firtina;

class ForFinal4 extends Thread implements Runnable {
    int toplam;
     int i;

    public ForFinal4(int i) {

        this.i = i;
    }

    public void topla() {

        for (; i < 5; i++) {
            toplam += i;
            System.out.println("Thread " + Thread.currentThread().getName() + ": Toplam = " + toplam);

        }
    }

    @Override
    public void run() {

        topla();



    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ForFinal4(4));
        Thread thread2 = new Thread(new ForFinal4(2));
        thread2.setName("2");
        thread1.setName("1");

        thread1.start();

        thread2.start();
    }
}
