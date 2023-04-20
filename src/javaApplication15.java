package firtina;

import java.util.ArrayList;

public class javaApplication15 {
    public static void main(String[] args) {
        ArrayList<String> sifre = new ArrayList<>();
        sifre.add("1234");
        sifre.add("324f");
        sifre.add("qer2");

        ArrayList<String> meslekler = new ArrayList<>();
        meslekler.add("sofor");
        meslekler.add("disci");
        meslekler.add("fotografci");

        int userName = meslekler.indexOf("sofor");
        String password = "1234";

        if (userName != -1) {
            if (sifre.get(userName).equals(password)) {

                System.out.println("login succeed");
            } else {
                System.out.println("wrong password");
            }

        } else {
            System.out.println("wrong username");
        }
    }
}
