package firtina;

public class ForFinal2 extends Thread {
    int sayi;

    public ForFinal2(int sayi) {

        this.sayi = sayi;
    }

    @Override
    public void run() {
        for (int i = 1; i <= sayi; i++) {
            System.out.println(" " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            if (i >= sayi) {
                try {
                    Thread.sleep(2000);
                    System.out.println("bitti");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

    public static void main(String[] args) {
        ForFinal2 k = new ForFinal2(50);
        k.start();

    }


}
