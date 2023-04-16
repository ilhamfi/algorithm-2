import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class javaApplication4 {
    public static void main(String[] args) throws IOException {
        //file nesnesi tanımlama
        File a1 = new File("isim.txt");
        //yapılacak işi tanımlama
        FileWriter b2=new FileWriter(a1);
        //içine yazma
        b2.write("mesut ozil");
        //dosyayı kapama
        b2.close();

    }
}
