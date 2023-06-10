package firtina;

class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("First Thread: " + i);
            if (i == 2) {
                try {
                    SecondThread secondThread = new SecondThread();
                    secondThread.start();
                    secondThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Second Thread: " + i);
        }
    }
}

public class thread3 {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
    }
}
