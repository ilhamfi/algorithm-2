package firtina;

public class thread1 implements Runnable {
    int start;
    int end;
    Thread nextThread;

    public thread1(int start, int end, Thread nextThread) {
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
        Thread e = new Thread(new thread1(101, 126, null));
        Thread d = new Thread(new thread1(76, 100, e));
        Thread c = new Thread(new thread1(51, 75, d));
        Thread b = new Thread(new thread1(26, 50, c));
        Thread a = new Thread(new thread1(1, 25, b));

        a.start();
    }
}
