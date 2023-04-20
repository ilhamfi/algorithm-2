package firtina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//dosya okumak için
public class javaApplication9 {
    public static void main(String[] args) throws IOException {
        File dosya=new File("kucukA.dat"); //1.file nesnesi tanımalama
        Scanner k=new Scanner(dosya); //2.scanner nesnesi tanımlama
        String s=k.nextLine();
        System.out.println(s); //3.işlem adımları
        k.close(); //4.dosyayı kapat
    }
}
