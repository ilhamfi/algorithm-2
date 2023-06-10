import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui2 extends JFrame implements ActionListener {
    JPanel panel;
    JTextField metin1;
    JButton btn1, btn2,btn3;

    JLabel label1;
    String s = "";

    gui2() {
        setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        btn1 = new JButton("0");
        btn2 = new JButton("1");
        btn3 = new JButton("hesapla");
        panel=new JPanel();// gozden kaçmıstı
        metin1 = new JTextField("",10);
        label1=new JLabel("sonuç");





        panel.add(metin1);


        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(label1);
        add(panel);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);


    }


    public static void main(String[] args) {
        gui2 yeni = new gui2();
        yeni.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            s = s + "0";
        } else if(e.getSource()==btn2) {
            s = s + "1";
        }
        else{
            int top=0,j=0;
            for (int i=s.length()-1;i>=0;i--){
                int basamak=s.charAt(i)-'0';
                top+=((int)(Math.pow(2,j)*basamak));
                j+=1;

            }
            label1.setText(""+top);
            s="";
        }

        metin1.setText(s);
    }
}
