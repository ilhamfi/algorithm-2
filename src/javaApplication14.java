package firtina;

import java.util.ArrayList;

public class javaApplication14 {
    public static void main(String[] args) {
        ArrayList<String> meslekler = new ArrayList<>();
        meslekler.add("sofor");
        meslekler.add("disci");
        meslekler.add("fotografci");


        boolean sayac = meslekler.contains("sofor");
        if (sayac) {
            System.out.println("login succeed");
        } else {
            System.out.println("login failed");
        }
    }
}
