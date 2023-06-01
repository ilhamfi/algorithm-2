package firtina;

import javax.swing.*;
import java.awt.*;

public class Grafik extends JFrame {
    Grafik() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        setSize(500, 500);
        panel.setBackground(Color.BLACK);
        panel.setOpaque(true);


        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.add(panel);
    }


    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.fillOval(200, 200, 50, 50);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        g.setColor(Color.orange);
        g.fillOval(260, 200, 50, 50);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        g.setColor(Color.WHITE);
        g.fillOval(260, 200, 50, 50);
        g.fillOval(200, 200, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(320, 200, 50, 50);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        g.setColor(Color.WHITE);
        g.fillOval(320, 200, 50, 50);
        g.setColor(Color.RED);
        g.fillOval(200, 200, 50, 50);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();
    }

    public static void main(String[] args) {
        Grafik x = new Grafik();
        x.setVisible(true);



    }


}
