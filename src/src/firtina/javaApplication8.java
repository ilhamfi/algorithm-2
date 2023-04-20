package firtina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javaApplication8 {
    public static void main(String[] args) throws IOException {
        File a1=new File("kücükAolanlar.dat");
        FileWriter fw=new FileWriter(a1);
        String kelimeler;
        Scanner k=new Scanner(System.in);
        for (int i=0;i<5;i++){
            kelimeler=k.next();
            if (kelimeler.charAt(0)=='a'){
                fw.write(kelimeler+" ");
            }

        }
        fw.close();

    }
}
