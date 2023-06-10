import javax.swing.*;
import java.awt.*;
import java.lang.Thread;

public class ForFinal5 extends JFrame {

    private OvalPanel light;

    public ForFinal5() {
        setTitle("Traffic Light");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100, 100);
        setLayout(new BorderLayout());

        light = createLight(Color.RED);
        add(light, BorderLayout.CENTER);
    }

    private OvalPanel createLight(Color color) {
        OvalPanel light = new OvalPanel(color);
        light.setPreferredSize(new Dimension(80, 200));
        return light;
    }

    public void start() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    light.setColor(Color.RED);

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    light.setColor(Color.YELLOW);

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    light.setColor(Color.GREEN);

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ForFinal5 trafficLight = new ForFinal5();
                trafficLight.setVisible(true);
                trafficLight.start();
            }
        });
    }
}

class OvalPanel extends JPanel {
    private Color color;

    public OvalPanel(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.setColor(color);
        g.fillOval(10, 10, width - 20, height - 20);
    }
}
