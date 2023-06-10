package firtina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class AsalSayiThread extends Thread {
    private String inputFile;
    private String outputFile;

    public AsalSayiThread(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile, true); // Append mode

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (isPrime(number)) {
                    synchronized (writer) {
                        writer.write(number + "\n");
                    }
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
}

public class okumaYazma {
    public static void main(String[] args) {
        String inputFile = "sayi.txt";
        String asalOutputFile = "asal.txt";
        String normalOutputFile = "normal.txt";

        AsalSayiThread thread1 = new AsalSayiThread(inputFile, asalOutputFile);
        AsalSayiThread thread2 = new AsalSayiThread(inputFile, normalOutputFile);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            System.out.println("İşlemler tamamlandı.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
