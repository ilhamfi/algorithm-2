package firtina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javaApplication5 {
    public static void main(String[] args) throws IOException {
        File k=new File("oyna.txt");
        Scanner oku=new Scanner(System.in);
        String adSoyad;
        FileWriter kw=new FileWriter(k);  //printWriter da FileWriter ile aynı işi görür.Ayrıca k'nın yanına eklenecek true, oyna.txt dosyasına
                                         //güncelleme,ilave ekleme için kullanılır.FileWriter true özelliğini destekler.printWriter desteklemez.
        for (int i=0;i<3;i++){          //filewriter true ifadesini destekler...write metodu.
                                       //printwriter ise print ve printlnyi destekler.

            adSoyad=oku.next();
            kw.write(adSoyad);

        }

        kw.close();




    }
}
