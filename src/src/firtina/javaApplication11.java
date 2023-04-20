package firtina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javaApplication11 {
    public static void main(String[] args) throws IOException {
        File l = new File("ali.txt");
        Scanner k = new Scanner(System.in);
        FileWriter fw = new FileWriter(l);

        for (int i = 0; i < 5; i++) {
            String s = k.nextLine();
            fw.write(s + " ");

        }
        fw.close();

        File l2 = new File("ali.txt");
        Scanner fk = new Scanner(l2);
        String st;
        while (fk.hasNext()) {
            st = fk.nextLine();
            System.out.println(st);

        }
        fk.close();

    }
}
