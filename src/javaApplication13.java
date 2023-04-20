package firtina;

import java.util.ArrayList;
import java.util.Arrays;

public class javaApplication13 {
    public static void main(String[] args) {
        Integer[] sayi = {7, 2, 5, 8, 23, 4};
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.addAll(Arrays.asList(sayi));
        System.out.println(sayilar.get(0));

        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }
         //foreach
        for (int tutac:sayilar) {
            System.out.println(tutac);
        }
    }
}
