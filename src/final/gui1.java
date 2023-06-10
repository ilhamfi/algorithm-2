import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui1 extends JFrame implements ActionListener {
    JTextField metin1,metin2;
    JLabel label1;
    JButton btn1;
    JPanel panel;

    gui1() {
        setSize(500, 500);
        metin1 = new JTextField("birinci sayi");
        metin2 = new JTextField("ijkinci sayi");

        btn1 = new JButton("tık");
        label1=new JLabel("sonuc:");
        panel = new JPanel();
        this.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        panel.add(metin1);
        panel.add(metin2);
        panel.add(btn1);
        panel.add(label1);

        add(panel);
        btn1.addActionListener(this);

    }


    public static void main(String[] args) {
        gui1 yeni = new gui1();
        yeni.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       int sayi1=Integer.parseInt(metin1.getText());
       int sayi2=Integer.parseInt(metin2.getText());
       int toplam=sayi1+sayi2;
       label1.setText("toplam"+toplam);

    }
}
