package firtina;

public class ForFinal1 implements Runnable {
    private int start;
    private int end;
    private Thread nextThread;

    public ForFinal1(int start, int end, Thread nextThread) {
        this.start = start;
        this.end = end;
        this.nextThread = nextThread;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void findPrimes() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Thread ID: " + Thread.currentThread().getName() + ", Prime: " + i);
            }
        }
    }

    @Override
    public void run() {
        findPrimes();
        if (nextThread != null) {
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread5=new Thread(new ForFinal1(101,126,null));
        Thread thread4 = new Thread(new ForFinal1(76, 100, thread5));
        Thread thread3 = new Thread(new ForFinal1(51, 75, thread4));
        Thread thread2 = new Thread(new ForFinal1(26, 50, thread3));
        Thread thread1 = new Thread(new ForFinal1(1, 25, thread2));

        thread1.start();
    }
}
